package com.ruoyi.web.controller.goods;

import com.ruoyi.common.core.domain.ResponseResult;
import com.ruoyi.common.core.domain.entity.SysGood;
import com.ruoyi.system.service.ISysGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsController2 {
    @Autowired
    private ISysGoodService goodService;
    @RequestMapping("/goods/list/category")      //返回某一类别产品列表
    public ResponseResult getGoodsListByCategory(Integer category) {
        ResponseResult result = goodService.getGoodsListOfCategory(category);
        return result;
    }

    @RequestMapping("/goods/list")
    public ResponseResult getGoodsList() {            //用于返回产品列表
        ResponseResult result = goodService.getAllGoodsList();
        return result;
    }
}
