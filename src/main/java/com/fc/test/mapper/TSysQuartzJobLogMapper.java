package com.fc.test.mapper;

import com.fc.test.model.TSysQuartzJobLog;
import com.fc.test.model.TSysQuartzJobLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysQuartzJobLogMapper {
    long countByExample(TSysQuartzJobLogExample example);

    int deleteByExample(TSysQuartzJobLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(TSysQuartzJobLog record);

    int insertSelective(TSysQuartzJobLog record);

    List<TSysQuartzJobLog> selectByExample(TSysQuartzJobLogExample example);

    TSysQuartzJobLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TSysQuartzJobLog record, @Param("example") TSysQuartzJobLogExample example);

    int updateByExample(@Param("record") TSysQuartzJobLog record, @Param("example") TSysQuartzJobLogExample example);

    int updateByPrimaryKeySelective(TSysQuartzJobLog record);

    int updateByPrimaryKey(TSysQuartzJobLog record);
}