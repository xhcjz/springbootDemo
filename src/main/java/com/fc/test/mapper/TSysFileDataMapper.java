package com.fc.test.mapper;

import com.fc.test.model.TSysFileData;
import com.fc.test.model.TSysFileDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysFileDataMapper {
    long countByExample(TSysFileDataExample example);

    int deleteByExample(TSysFileDataExample example);

    int deleteByPrimaryKey(String id);

    int insert(TSysFileData record);

    int insertSelective(TSysFileData record);

    List<TSysFileData> selectByExample(TSysFileDataExample example);

    TSysFileData selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TSysFileData record, @Param("example") TSysFileDataExample example);

    int updateByExample(@Param("record") TSysFileData record, @Param("example") TSysFileDataExample example);

    int updateByPrimaryKeySelective(TSysFileData record);

    int updateByPrimaryKey(TSysFileData record);
}