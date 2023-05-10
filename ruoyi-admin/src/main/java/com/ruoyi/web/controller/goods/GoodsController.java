package com.ruoyi.web.controller.goods;

import com.ruoyi.system.domain.SysGood;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GoodsController {
    @RequestMapping("/goods/list/id")
    public List<SysGood> getGoodById(Integer id) {

        return null;
    }

    @RequestMapping("/goods/list/category")
    public List<SysGood> getGoodListByCategory(Integer category) {

        System.out.println(category);
        return null;
    }

    @RequestMapping("/goods/list")
    public List<SysGood> getGoodsList() {            //用于返回产品列表
        SysGood good1 = new SysGood(101, "迎驾贡酒", "好喝", null, 1);
        SysGood good2 = new SysGood(102, "奇瑞汽车", "好开", null, 2);
        SysGood good3 = new SysGood(103, "奇瑞汽车", "好开", null, 3);
        SysGood good4 = new SysGood(104, "奇瑞汽车", "好开", null, 4);
        SysGood good5 = new SysGood(105, "奇瑞汽车", "好开", null, 1);
        SysGood good6 = new SysGood(106, "奇瑞汽车", "好开", null, 2);
        SysGood good7 = new SysGood(107, "奇瑞汽车", "好开", null, 3);
        SysGood good8 = new SysGood(108, "奇瑞汽车", "好开", null, 4);

        ArrayList<SysGood> list = new ArrayList<>();
        list.add(good1);
        list.add(good2);
        list.add(good3);
        list.add(good4);
        list.add(good5);
        list.add(good6);
        list.add(good7);
        list.add(good8);


        return list;
    }

}
