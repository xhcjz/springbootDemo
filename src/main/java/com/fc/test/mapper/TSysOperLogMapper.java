package com.fc.test.mapper;

import com.fc.test.model.TSysOperLog;
import com.fc.test.model.TSysOperLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysOperLogMapper {
    long countByExample(TSysOperLogExample example);

    int deleteByExample(TSysOperLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(TSysOperLog record);

    int insertSelective(TSysOperLog record);

    List<TSysOperLog> selectByExample(TSysOperLogExample example);

    TSysOperLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TSysOperLog record, @Param("example") TSysOperLogExample example);

    int updateByExample(@Param("record") TSysOperLog record, @Param("example") TSysOperLogExample example);

    int updateByPrimaryKeySelective(TSysOperLog record);

    int updateByPrimaryKey(TSysOperLog record);
}