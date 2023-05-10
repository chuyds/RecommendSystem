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

        ArrayList<SysGood> list = new ArrayList<>();
        list.add(good1);
        list.add(good2);


        return list;
    }

}
