package com.fc.test.mapper;

import com.fc.test.model.TSysQuartzJob;
import com.fc.test.model.TSysQuartzJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysQuartzJobMapper {
    long countByExample(TSysQuartzJobExample example);

    int deleteByExample(TSysQuartzJobExample example);

    int deleteByPrimaryKey(String id);

    int insert(TSysQuartzJob record);

    int insertSelective(TSysQuartzJob record);

    List<TSysQuartzJob> selectByExample(TSysQuartzJobExample example);

    TSysQuartzJob selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TSysQuartzJob record, @Param("example") TSysQuartzJobExample example);

    int updateByExample(@Param("record") TSysQuartzJob record, @Param("example") TSysQuartzJobExample example);

    int updateByPrimaryKeySelective(TSysQuartzJob record);

    int updateByPrimaryKey(TSysQuartzJob record);
}