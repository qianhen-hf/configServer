package com.fan.configserver.vo;

import lombok.Data;

import java.util.Date;

/**
 * java类简单作用描述
 *
 * @Description: java类作用描述
 * @Author: hf
 * @CreateDate: 2018/8/30 15:28
 * @UpdateUser: hf
 * @UpdateDate: 2018/8/30 15:28
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */
@Data
public class ApplicationEnvRequest {

    private Long applicationId;

    private String applicationEnvName;

    private String applicationEnvDesc;

}
