package com.ruoyi.system.service.impl;

import com.ruoyi.common.core.domain.ResponseResult;
import com.ruoyi.common.core.domain.entity.SysGood;
import com.ruoyi.system.mapper.SysGoodMapper;
import com.ruoyi.system.service.ISysGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysGoodServiceImpl implements ISysGoodService {
    @Autowired
    private SysGoodMapper goodMapper;
    @Override
    public ResponseResult getAllGoodsList() {
        List<SysGood> allGoodsList = goodMapper.getAllGoodsList();
        return new ResponseResult(0,"数据查询成功",allGoodsList);
    }

    @Override
    public ResponseResult getGoodsListOfCategory(Integer category) {
        List<SysGood> goodsListOfCategory = goodMapper.getGoodsListOfCategory(category);
        return new ResponseResult(0,"数据查询成功",goodsListOfCategory);
    }
}
