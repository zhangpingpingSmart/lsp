package com.zpp.lsp.config.login;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: 张平平
 * @Date: 2021/3/10 14:55
 */
@Configuration
public class LoginConfiguration implements WebMvcConfigurer {

    /**
     * 这里需要先将限流拦截器入住，不然无法获取到拦截器中的redistemplate
     * @return
     */
    @Bean
    public LoginInterceptor getAccessLimitIntercept() {
        return new LoginInterceptor();
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getAccessLimitIntercept()).addPathPatterns("/**");
    }
}