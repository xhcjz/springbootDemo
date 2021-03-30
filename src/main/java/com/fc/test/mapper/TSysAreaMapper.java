package com.fc.test.mapper;

import com.fc.test.model.TSysArea;
import com.fc.test.model.TSysAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysAreaMapper {
    long countByExample(TSysAreaExample example);

    int deleteByExample(TSysAreaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TSysArea record);

    int insertSelective(TSysArea record);

    List<TSysArea> selectByExample(TSysAreaExample example);

    TSysArea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TSysArea record, @Param("example") TSysAreaExample example);

    int updateByExample(@Param("record") TSysArea record, @Param("example") TSysAreaExample example);

    int updateByPrimaryKeySelective(TSysArea record);

    int updateByPrimaryKey(TSysArea record);
}