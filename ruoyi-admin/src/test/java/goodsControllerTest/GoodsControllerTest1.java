package goodsControllerTest;

import com.ruoyi.common.core.domain.ResponseResult;
import com.ruoyi.common.core.domain.entity.SysGood;
import com.ruoyi.system.service.ISysGoodService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

import java.util.List;


@SpringBootTest
public class GoodsControllerTest1 {
    @Autowired
    private ISysGoodService goodService;
    @Test
    public void test1(){
        ResponseResult allGoodsList = goodService.getAllGoodsList();
        List<SysGood> data = (List<SysGood>) allGoodsList.getData();
        data.forEach(System.out::println);
    }
}
