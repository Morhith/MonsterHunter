/*
 * @Author: Hitysept
 * @Date: 2021-03-19 22:27:07
 * @LastEditors: Hitysept
 * @LastEditTime: 2021-03-19 23:55:24
 * @Description: file content
 * @FilePath: \mhweb\src\main\java\com\mh\mhweb\mhconfig\MhConfiguration.java
 */
package com.mh.mhweb.mhconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class MhConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/**")
            .allowedOrigins("http://localhost:8080")
            .allowedMethods("PUT", "DELETE","POST","GET")
            .allowedHeaders("http://localhost:8088", "header2", "header3")
            .exposedHeaders("header1", "header2")
            .allowCredentials(true).maxAge(3600);
    }
}


