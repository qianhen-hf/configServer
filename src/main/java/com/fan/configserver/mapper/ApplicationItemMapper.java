package com.fan.configserver.mapper;

import com.fan.configserver.po.ApplicationItem;
import com.fan.configserver.po.ApplicationItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplicationItemMapper {
    int countByExample(ApplicationItemExample example);

    int deleteByExample(ApplicationItemExample example);

    int deleteByPrimaryKey(Long itemId);

    int insert(ApplicationItem record);

    int insertSelective(ApplicationItem record);

    List<ApplicationItem> selectByExample(ApplicationItemExample example);

    ApplicationItem selectByPrimaryKey(Long itemId);

    int updateByExampleSelective(@Param("record") ApplicationItem record, @Param("example") ApplicationItemExample example);

    int updateByExample(@Param("record") ApplicationItem record, @Param("example") ApplicationItemExample example);

    int updateByPrimaryKeySelective(ApplicationItem record);

    int updateByPrimaryKey(ApplicationItem record);
}