package com.activiti6.config;

import org.activiti.engine.impl.persistence.StrongUuidGenerator;
import org.activiti.spring.SpringProcessEngineConfiguration;
import org.activiti.spring.boot.ProcessEngineConfigurationConfigurer;
import org.springframework.context.annotation.Configuration;

/**
 * activiti 配置类
 * liuzhize 2019年3月7日下午3:26:56
 */
@Configuration
public class ActivitiConfig implements ProcessEngineConfigurationConfigurer {


    @Override
    public void configure(SpringProcessEngineConfiguration processEngineConfiguration) {
        processEngineConfiguration.setActivityFontName("宋体");
        processEngineConfiguration.setLabelFontName("宋体");
        processEngineConfiguration.setAnnotationFontName("宋体");
        StrongUuidGenerator uuidGenerator = new StrongUuidGenerator();
        processEngineConfiguration.setIdGenerator(uuidGenerator);
    }

}
