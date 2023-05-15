package com.ruoyi.web.controller.goods;

import com.ruoyi.framework.web.domain.server.Sys;
import com.ruoyi.system.domain.SysGood;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GoodsController {
    ArrayList<SysGood> list = new ArrayList<>();
    {
        SysGood good1 = new SysGood("101", "古井贡酒", "好喝", "https://pic12.secooimg.com/imgextra/2020/0413/08b7521604a646928d536918bf799d5b.jpg", 3);
        SysGood good2 = new SysGood("102", "奇瑞汽车", "好开", "https://2c.zol-img.com.cn/product/13/226/cefjbcwLtVsIc.jpg", 1);
        SysGood good3 = new SysGood("103", "奇瑞汽车", "好开", "https://2c.zol-img.com.cn/product/13/226/cefjbcwLtVsIc.jpg", 1);
        SysGood good4 = new SysGood("104", "奇瑞汽车", "好开", "https://2c.zol-img.com.cn/product/13/226/cefjbcwLtVsIc.jpg", 1);
        SysGood good5 = new SysGood("105", "奇瑞汽车", "好开", "https://2c.zol-img.com.cn/product/13/226/cefjbcwLtVsIc.jpg", 1);
        SysGood good6 = new SysGood("106", "奇瑞汽车", "好开", "https://2c.zol-img.com.cn/product/13/226/cefjbcwLtVsIc.jpg", 1);
        SysGood good7 = new SysGood("107", "奇瑞汽车", "好开", "https://2c.zol-img.com.cn/product/13/226/cefjbcwLtVsIc.jpg", 1);
        SysGood good8 = new SysGood("108", "奇瑞汽车", "好开", "https://2c.zol-img.com.cn/product/13/226/cefjbcwLtVsIc.jpg", 1);

        list.add(good1);
        list.add(good2);
        list.add(good3);
        list.add(good4);
        list.add(good5);
        list.add(good6);
        list.add(good7);
        list.add(good8);
    }
    @RequestMapping("/goods/list/id")
    public List<SysGood> getGoodById(Integer id) {

        return null;
    }

    @RequestMapping("/goods/list/category")
    public List<SysGood> getGoodListByCategory(Integer category) {

        ArrayList<SysGood> listOfCategory = new ArrayList<>();
        for (SysGood good: list) {
            if (good.getCategory() == category){
                listOfCategory.add(good);
            }
        }
        return listOfCategory;
    }

    @RequestMapping("/goods/list")
    public List<SysGood> getGoodsList() {            //用于返回产品列表
        return list;
    }

}
