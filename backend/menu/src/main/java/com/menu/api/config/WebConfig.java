package com.menu.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
    	registry.addMapping("/**")
    	.allowedOrigins("*")
        .allowedMethods("OPTIONS","HEAD","GET","PUT","POST","POST","DELETE","PATCH");
    }
}

