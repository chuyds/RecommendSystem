package com.ruoyi.web.controller.goods;

import com.ruoyi.system.domain.SysGood;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsController {
    @RequestMapping("/goods/list/id")
    public List<SysGood> getGoodById(@RequestParam int id){

        return null;
    }
    @RequestMapping("/goods/list/category")
    public List<SysGood> getGoodListByCategory(@RequestParam String category){

        return null;
    }
    @RequestMapping("/goods/list")
    public List<SysGood> getGoodsList(){            //用于返回产品列表


        return null;
    }

}
