package com.ruoyi.system.service;

import com.ruoyi.common.core.domain.ResponseResult;
import com.ruoyi.common.core.domain.entity.SysGood;

import java.util.List;

public interface ISysGoodService {
    public ResponseResult getAllGoodsList();
    public ResponseResult getGoodsListOfCategory(Integer category);

}
