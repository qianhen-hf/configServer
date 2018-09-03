package com.fan.configserver.config;

import com.fan.configserver.environment.DbEnvironmentRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * java类简单作用描述
 *
 * @Description: java类作用描述
 * @Author: hf
 * @CreateDate: 2018/8/29 16:44
 * @UpdateUser: hf
 * @UpdateDate: 2018/8/29 16:44
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */

@Configuration
@Profile("db")
public class DbEnvironmentRepositoryConfiguration {

    @Bean
    public DbEnvironmentRepository getDbEnvironmentRepository() {
        return new DbEnvironmentRepository();
    }
}
