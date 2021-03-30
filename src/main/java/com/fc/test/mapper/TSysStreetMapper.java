package com.fc.test.mapper;

import com.fc.test.model.TSysStreet;
import com.fc.test.model.TSysStreetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysStreetMapper {
    long countByExample(TSysStreetExample example);

    int deleteByExample(TSysStreetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TSysStreet record);

    int insertSelective(TSysStreet record);

    List<TSysStreet> selectByExample(TSysStreetExample example);

    TSysStreet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TSysStreet record, @Param("example") TSysStreetExample example);

    int updateByExample(@Param("record") TSysStreet record, @Param("example") TSysStreetExample example);

    int updateByPrimaryKeySelective(TSysStreet record);

    int updateByPrimaryKey(TSysStreet record);
}