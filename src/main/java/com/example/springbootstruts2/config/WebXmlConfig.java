package com.example.springbootstruts2.config;

import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Struts的web.xml配置
 *
 * @author hongcunlin
 */
@Configuration
public class WebXmlConfig {
    /**
     * 官网的方法配置过滤器
     *
     * @return Struts2配置
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        // 加入Struts2
        filterRegistrationBean.setFilter(new StrutsPrepareAndExecuteFilter());
        List list = new ArrayList();
        list.add("/*");
        filterRegistrationBean.setUrlPatterns(list);
        return filterRegistrationBean;
    }
}
