package com.fc.test.mapper;

import com.fc.test.model.TSysCity;
import com.fc.test.model.TSysCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysCityMapper {
    long countByExample(TSysCityExample example);

    int deleteByExample(TSysCityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TSysCity record);

    int insertSelective(TSysCity record);

    List<TSysCity> selectByExample(TSysCityExample example);

    TSysCity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TSysCity record, @Param("example") TSysCityExample example);

    int updateByExample(@Param("record") TSysCity record, @Param("example") TSysCityExample example);

    int updateByPrimaryKeySelective(TSysCity record);

    int updateByPrimaryKey(TSysCity record);
}