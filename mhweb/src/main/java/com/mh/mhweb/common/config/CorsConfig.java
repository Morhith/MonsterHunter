/*
 * @Author: Hitysept
 * @Date: 2021-03-25 03:37:44
 * @LastEditors: Hitysept
 * @LastEditTime: 2021-03-25 03:48:02
 * @Description: file content
 * @FilePath: \mhweb\src\main\java\com\mh\mhweb\common\config\CorsConfig.java
 */
package com.mh.mhweb.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class CorsConfig extends WebMvcConfigurationSupport {
    // 当前跨域请求最大有效时长。这里默认30天
    private long maxAge = 30 * 24 * 60 * 60;
   

        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/api/**")
                    .allowedOrigins("http://localhost:8080")
                    .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")
                    .maxAge(maxAge)
                    .allowCredentials(true);
        }
}

