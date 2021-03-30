package com.fc.test.mapper;

import com.fc.test.model.TSysInterUrl;
import com.fc.test.model.TSysInterUrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysInterUrlMapper {
    long countByExample(TSysInterUrlExample example);

    int deleteByExample(TSysInterUrlExample example);

    int deleteByPrimaryKey(String id);

    int insert(TSysInterUrl record);

    int insertSelective(TSysInterUrl record);

    List<TSysInterUrl> selectByExample(TSysInterUrlExample example);

    TSysInterUrl selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TSysInterUrl record, @Param("example") TSysInterUrlExample example);

    int updateByExample(@Param("record") TSysInterUrl record, @Param("example") TSysInterUrlExample example);

    int updateByPrimaryKeySelective(TSysInterUrl record);

    int updateByPrimaryKey(TSysInterUrl record);
}