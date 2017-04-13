package com.hanzo.springboot.adminlte.velocity.config;

import org.apache.velocity.tools.config.DefaultKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.velocity.VelocityProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.velocity.VelocityLayoutViewResolver;

import java.util.Map;

/**
 * Created by P10103052 on 2017/3/29.
 */

@Configuration
public class VelocityLayoutConfig {
    @Autowired
    ApplicationContext applicationContext;

    @Bean(name = "velocityViewResolver")
    public VelocityLayoutViewResolver velocityViewResolver(VelocityProperties properties) {
        VelocityLayoutViewResolver resolver = new VelocityLayoutViewResolver();
        properties.applyToViewResolver(resolver);
        resolver.setLayoutUrl("layouts/default.vm");
        Map<String, Object> beans = applicationContext.getBeansWithAnnotation(DefaultKey.class);
        for (Map.Entry<String, Object> entry : beans.entrySet()) {
            resolver.getAttributesMap().put(entry.getKey(), entry.getValue());
        }
        return resolver;
    }
}