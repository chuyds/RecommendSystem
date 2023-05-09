package com.ruoyi.common.dao;

import com.ruoyi.common.utils.JDBCUtil;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseDAO {
    public void update(Connection connection, String sql, Object... args) {
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
                ps.setObject(i + 1, args[i]);
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
        JDBCUtil.closeResource(null, ps, null);
    }

    public <T> List<T> select(Connection connection, Class<T> clazz, String sql, Object... args) {
        PreparedStatement ps = null;
        ResultSet resultSet = null;

        try {
            //预编译sql
            ps = connection.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            //执行sql并获取结果集
            resultSet = ps.executeQuery();

            //获取结果集的元数据
            ResultSetMetaData metaData = resultSet.getMetaData();

            int columnCount = metaData.getColumnCount();
            List<T> list = new ArrayList<>();
            while (resultSet.next()) {
                T t = clazz.newInstance();
                //遍历每一列
                for (int i = 0; i < columnCount; i++) {
                    //获取列的别名（没有别名时，就取列名）
                    String columnLabel = metaData.getColumnLabel(i + 1);
                    //获取列值
                    Object columnValue = resultSet.getObject(i + 1);
                    //通过反射获得属性
                    Field field = clazz.getDeclaredField(columnLabel);
                    //设置field为可访问的
                    field.setAccessible(true);
                    //通过反射设置对象的属性值
                    field.set(t, columnValue);
                }
                //添加数据到列表
                list.add(t);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            JDBCUtil.closeResource(null, ps, resultSet);
        }

        return null;
    }

}
