package com.fc.test.mapper;

import com.fc.test.model.TSysProvince;
import com.fc.test.model.TSysProvinceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysProvinceMapper {
    long countByExample(TSysProvinceExample example);

    int deleteByExample(TSysProvinceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TSysProvince record);

    int insertSelective(TSysProvince record);

    List<TSysProvince> selectByExample(TSysProvinceExample example);

    TSysProvince selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TSysProvince record, @Param("example") TSysProvinceExample example);

    int updateByExample(@Param("record") TSysProvince record, @Param("example") TSysProvinceExample example);

    int updateByPrimaryKeySelective(TSysProvince record);

    int updateByPrimaryKey(TSysProvince record);
}