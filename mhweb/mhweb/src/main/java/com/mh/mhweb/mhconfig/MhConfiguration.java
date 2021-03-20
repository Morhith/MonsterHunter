/*
 * @Author: Hitysept
 * @Date: 2021-03-19 22:27:07
 * @LastEditors: Hitysept
 * @LastEditTime: 2021-03-20 10:23:24
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

        registry.addMapping("/api/**")
            .allowedOrigins("http://localhost:8080")
            .allowedHeaders("*")
            .allowedMethods("*")
            .maxAge(3600);
    }
}


