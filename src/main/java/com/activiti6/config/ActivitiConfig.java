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

    private final static String FONT_NAME = "宋体";

    @Override
    public void configure(SpringProcessEngineConfiguration processEngineConfiguration) {
        processEngineConfiguration.setActivityFontName(FONT_NAME);
        processEngineConfiguration.setLabelFontName(FONT_NAME);
        processEngineConfiguration.setAnnotationFontName(FONT_NAME);
        StrongUuidGenerator uuidGenerator = new StrongUuidGenerator();
        processEngineConfiguration.setIdGenerator(uuidGenerator);
    }

}
