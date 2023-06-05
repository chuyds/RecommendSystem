package ControllerTest;

import com.ruoyi.RuoYiApplication;
import com.ruoyi.common.core.domain.ResponseResult;
import com.ruoyi.common.core.domain.entity.SysDept;
import com.ruoyi.common.core.domain.entity.SysGood;
import com.ruoyi.system.service.ISysDeptService;
import com.ruoyi.system.service.ISysGoodService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = RuoYiApplication.class)
public class ControllerTest1 {
    @Autowired
    private ISysGoodService goodService;

    @Autowired
    private ISysDeptService deptService;
    @Test
    public void test1(){
        ResponseResult result1 = goodService.getAllGoodsList();
        List<SysGood> list1 = (List<SysGood>) result1.getData();
        list1.forEach(System.out::println);

        ResponseResult result2 = goodService.getGoodsListOfCategory(1);
        List<SysGood> list2 = (List<SysGood>) result2.getData();
        list2.forEach(System.out::println);
    }

    @Test
    public void test2(){
        List<Long> list = deptService.selectDeptListByRoleId((long) 1);
        list.forEach(System.out::println);
    }
}
