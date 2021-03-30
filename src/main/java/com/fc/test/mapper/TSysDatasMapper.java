package com.fc.test.mapper;

import com.fc.test.model.TSysDatas;
import com.fc.test.model.TSysDatasExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysDatasMapper {
    long countByExample(TSysDatasExample example);

    int deleteByExample(TSysDatasExample example);

    int deleteByPrimaryKey(String id);

    int insert(TSysDatas record);

    int insertSelective(TSysDatas record);

    List<TSysDatas> selectByExample(TSysDatasExample example);

    TSysDatas selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TSysDatas record, @Param("example") TSysDatasExample example);

    int updateByExample(@Param("record") TSysDatas record, @Param("example") TSysDatasExample example);

    int updateByPrimaryKeySelective(TSysDatas record);

    int updateByPrimaryKey(TSysDatas record);
}