package com.qfedu.mapper;

import com.qfedu.domain.County;

public interface CountyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(County record);

    int insertSelective(County record);

    County selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(County record);

    int updateByPrimaryKey(County record);
}