package com.woniu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author llf
 * @date 2020/3/25 18:35
 */
@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {

    // 专门用于配置跨域请求的方法
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 表示允许客户端访问当前web应用的任何资源
                .allowedMethods("*")            // 表示允许客户端的所有请求方式： GET POST PUT DELETE OPSTIONS
                .allowedOrigins("*");      // 表示允许指定的IP地址，向当前web应用发送跨域ajax请求
    }
}
