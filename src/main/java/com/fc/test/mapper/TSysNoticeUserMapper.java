package com.fc.test.mapper;

import com.fc.test.model.TSysNoticeUser;
import com.fc.test.model.TSysNoticeUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysNoticeUserMapper {
    long countByExample(TSysNoticeUserExample example);

    int deleteByExample(TSysNoticeUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(TSysNoticeUser record);

    int insertSelective(TSysNoticeUser record);

    List<TSysNoticeUser> selectByExample(TSysNoticeUserExample example);

    TSysNoticeUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TSysNoticeUser record, @Param("example") TSysNoticeUserExample example);

    int updateByExample(@Param("record") TSysNoticeUser record, @Param("example") TSysNoticeUserExample example);

    int updateByPrimaryKeySelective(TSysNoticeUser record);

    int updateByPrimaryKey(TSysNoticeUser record);
}