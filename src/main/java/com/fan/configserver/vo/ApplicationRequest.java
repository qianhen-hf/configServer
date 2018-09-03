package com.fan.configserver.vo;

import lombok.Data;

import java.util.Date;

/**
 * java类简单作用描述
 *
 * @Description: java类作用描述
 * @Author: hf
 * @CreateDate: 2018/8/30 14:40
 * @UpdateUser: hf
 * @UpdateDate: 2018/8/30 14:40
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */
@Data
public class ApplicationRequest {

    private String applicationName;

    private Integer applicationType;

    private String applicationDesc;

    private Long liableUserId;

}
