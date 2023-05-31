package com.ruoyi.system.mapper;

import com.ruoyi.common.core.domain.entity.SysGood;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysGoodMapper {
    public List<SysGood> getAllGoodsList();
    public List<SysGood> getGoodsListOfCategory(Integer category);

}
