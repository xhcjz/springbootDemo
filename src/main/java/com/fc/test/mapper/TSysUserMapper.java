package com.fc.test.mapper;

import com.fc.test.model.TSysUser;
import com.fc.test.model.TSysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysUserMapper {
    long countByExample(TSysUserExample example);

    int deleteByExample(TSysUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(TSysUser record);

    int insertSelective(TSysUser record);

    List<TSysUser> selectByExample(TSysUserExample example);

    TSysUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TSysUser record, @Param("example") TSysUserExample example);

    int updateByExample(@Param("record") TSysUser record, @Param("example") TSysUserExample example);

    int updateByPrimaryKeySelective(TSysUser record);

    int updateByPrimaryKey(TSysUser record);
}