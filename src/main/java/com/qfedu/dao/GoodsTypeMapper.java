package com.qfedu.dao;

import com.qfedu.pojo.GoodsType;

public interface GoodsTypeMapper {
    int deleteByPrimaryKey(Integer gtId);

    int insert(GoodsType record);

    int insertSelective(GoodsType record);

    GoodsType selectByPrimaryKey(Integer gtId);

    int updateByPrimaryKeySelective(GoodsType record);

    int updateByPrimaryKey(GoodsType record);
}