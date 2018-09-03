package com.fan.configserver.environment;

import com.fan.configserver.po.Application;
import com.fan.configserver.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.config.environment.PropertySource;
import org.springframework.cloud.config.server.environment.EnvironmentRepository;
import org.springframework.util.StringUtils;

import java.util.*;

/**
 * java类简单作用描述
 *
 * @Description: java类作用描述
 * @Author: hf
 * @CreateDate: 2018/8/29 16:49
 * @UpdateUser: hf
 * @UpdateDate: 2018/8/29 16:49
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */

public class DbEnvironmentRepository implements EnvironmentRepository {
    @Autowired
    ApplicationService applicationService;

    @Override
    public Environment findOne(String application, String profile, String label) {
        String config = application;
        if (StringUtils.isEmpty(label)) {
            label = "master";
        }
        if (StringUtils.isEmpty(profile)) {
            profile = "default";
        }
        if (!profile.startsWith("default")) {
            profile = "default," + profile;
        }
        String[] profiles = StringUtils.commaDelimitedListToStringArray(profile);
        Environment environment = new Environment(application, profiles, label, null, null);
        System.out.println("12");
        List<String> applications = new ArrayList<String>(new LinkedHashSet<>(Arrays.asList(StringUtils.commaDelimitedListToStringArray(config))));
        List<String> envs = new ArrayList<String>(new LinkedHashSet<>(Arrays.asList(profiles)));
        Collections.reverse(applications);
        Collections.reverse(envs);
        for (String app : applications) {
            Application application1 = applicationService.getApplicationByName(app);
            System.out.println(application1.getApplicationName());
            for (String env : envs) {
                Map<String, String> next = new HashMap<>();
                next.put("a", "a");
                next.put("a1", "a1");
                next.put("a2", "a2");
                if (!next.isEmpty()) {
                    environment.add(new PropertySource(app + "-" + env, next));
                }
            }
        }
        return environment;
    }


    public Map<String, String> getApplicationItem(Long applicationId, String applicationName) {
        return null;
    }
}
