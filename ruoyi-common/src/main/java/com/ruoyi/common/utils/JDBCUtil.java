package com.ruoyi.common.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import javax.sql.DataSource;
import java.io.*;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class JDBCUtil {
    public static Connection getConnect(){
        FileReader fr = null;
        try {
            fr = new FileReader("resource\\jdbc.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Properties properties = new Properties();
        try {
            properties.load(fr);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    private static DataSource ds = null;
    //静态代码块，获取druid连接池
    static {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(new File("resource\\druid.properties"));
            Properties pro = new Properties();
            pro.load(fis);
            //获取连接池
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{
                if (fis!=null)
                    fis.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static Connection getDruidConnect(){
        //获取连接
        Connection connect = null;
        try {
            connect = ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connect;
    }

    public static void update(String sql, Object ... args){
        //建立连接
        Connection connection = getConnect();

        //设置sql语句，并使用占位符预编译
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //填充占位符
        for (int i = 0; i < args.length; i++) {
            try {
                ps.setObject(i+1,args[i]);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        //执行
        try {
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //关闭资源
        try {
            ps.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static <T> List<T> select(Class<T> clazz,String sql,Object ... args){
        //数据库连接
        Connection connection = getConnect();

        PreparedStatement ps = null;
        ResultSet resultSet = null;

        try {
            //预编译sql
            ps = connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i+1,args[i]);
            }
            //执行sql并获取结果集
            resultSet = ps.executeQuery();

            //获取结果集的元数据
            ResultSetMetaData metaData = resultSet.getMetaData();

            int columnCount = metaData.getColumnCount();
            List<T> list = new ArrayList<>();
            while(resultSet.next()){
                T t = clazz.newInstance();
                //遍历每一列
                for (int i = 0; i < columnCount; i++) {
                    //获取列的别名（没有别名时，就取列名）
                    String columnLabel = metaData.getColumnLabel(i + 1);
                    //获取列值
                    Object columnValue = resultSet.getObject(i+1);
                    //通过反射获得属性
                    Field field = clazz.getDeclaredField(columnLabel);
                    //设置field为可访问的
                    field.setAccessible(true);
                    //通过反射设置对象的属性值
                    field.set(t,columnValue);
                }
                //添加数据到列表
                list.add(t);
            }
            return list;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭资源
            try {
                if (resultSet!=null)
                    resultSet.close();
                if (ps!=null)
                    ps.close();
                if (connection!=null)
                    connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }

        return null;
    }

    public static void closeResource(Connection connect, PreparedStatement pst, ResultSet rst){
        try{
            if (rst!=null)
                rst.close();
            if (pst!=null)
                pst.close();
            if (connect!=null)
                connect.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
