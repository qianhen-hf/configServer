package com.fan.configserver.mapper;

import com.fan.configserver.po.ApplicationEnv;
import com.fan.configserver.po.ApplicationEnvExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplicationEnvMapper {
    int countByExample(ApplicationEnvExample example);

    int deleteByExample(ApplicationEnvExample example);

    int deleteByPrimaryKey(Long applicationEnvId);

    int insert(ApplicationEnv record);

    int insertSelective(ApplicationEnv record);

    List<ApplicationEnv> selectByExample(ApplicationEnvExample example);

    ApplicationEnv selectByPrimaryKey(Long applicationEnvId);

    int updateByExampleSelective(@Param("record") ApplicationEnv record, @Param("example") ApplicationEnvExample example);

    int updateByExample(@Param("record") ApplicationEnv record, @Param("example") ApplicationEnvExample example);

    int updateByPrimaryKeySelective(ApplicationEnv record);

    int updateByPrimaryKey(ApplicationEnv record);
}