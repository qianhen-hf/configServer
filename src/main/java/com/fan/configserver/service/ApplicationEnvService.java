package com.fan.configserver.service;

import com.fan.configserver.mapper.ApplicationEnvMapper;
import com.fan.configserver.po.Application;
import com.fan.configserver.po.ApplicationEnv;
import com.fan.configserver.po.ApplicationEnvExample;
import com.fan.configserver.po.ApplicationExample;
import com.fan.configserver.vo.ApplicationEnvRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * java类简单作用描述
 *
 * @Description: java类作用描述
 * @Author: hf
 * @CreateDate: 2018/8/30 15:26
 * @UpdateUser: hf
 * @UpdateDate: 2018/8/30 15:26
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */
@Service
public class ApplicationEnvService {
    @Autowired
    ApplicationEnvMapper applicationEnvMapper;
    @Autowired
    Environment env;

    public void createApplicationEnv(ApplicationEnvRequest applicationEnvRequest) {
        ApplicationEnv applicationEnv = new ApplicationEnv();
        BeanUtils.copyProperties(applicationEnvRequest, applicationEnv);
        applicationEnvMapper.insertSelective(applicationEnv);
    }

    public void createCommonEnv(Long applicationId) {
        ApplicationEnv applicationEnv = new ApplicationEnv();
        applicationEnv.setApplicationEnvName(this.getCommonEnvName());
        applicationEnv.setApplicationId(applicationId);
        applicationEnvMapper.insertSelective(applicationEnv);
    }


    public String getCommonEnvName() {
        String common = "_common";
        String property = env.getProperty("env.common");
        if (StringUtils.isNotBlank(property)) {
            common = property;
        }
        return common;
    }

    public ApplicationEnv getApplicationEnvByName(Long applicationId, String commonEnvName) {
        ApplicationEnvExample applicationEnvExample = new ApplicationEnvExample();
        ApplicationEnvExample.Criteria criteria = applicationEnvExample.createCriteria();
        criteria.andApplicationEnvNameEqualTo(commonEnvName);
        criteria.andApplicationIdEqualTo(applicationId);
        List<ApplicationEnv> applicationEnvs = applicationEnvMapper.selectByExample(applicationEnvExample);
        if (applicationEnvs.isEmpty()) {
            return null;
        }
        return applicationEnvs.get(0);

    }
}
