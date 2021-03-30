package com.fc.test.mapper;

import com.fc.test.model.TSysNotice;
import com.fc.test.model.TSysNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSysNoticeMapper {
    long countByExample(TSysNoticeExample example);

    int deleteByExample(TSysNoticeExample example);

    int deleteByPrimaryKey(String id);

    int insert(TSysNotice record);

    int insertSelective(TSysNotice record);

    List<TSysNotice> selectByExample(TSysNoticeExample example);

    TSysNotice selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TSysNotice record, @Param("example") TSysNoticeExample example);

    int updateByExample(@Param("record") TSysNotice record, @Param("example") TSysNoticeExample example);

    int updateByPrimaryKeySelective(TSysNotice record);

    int updateByPrimaryKey(TSysNotice record);
}