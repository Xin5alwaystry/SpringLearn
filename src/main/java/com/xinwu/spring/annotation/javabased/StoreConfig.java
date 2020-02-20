package com.xinwu.spring.annotation.javabased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Bean注解用于配置和初始化一个由Spring IOC容器管理的bean，类似于配置文件中的<bean>。
 * - name属性可用于自定义bean的name
 * - initMethod属性可以指定容器生成bean时的初始化方法
 * - destroyMethod属性可以指定容器销毁bean时调用的销毁方法
 *
 * @ImportResource 标识引入资源文件
 */
@Configuration
@ImportResource("classpath:config.xml")
public class StoreConfig {
    @Value("${url}")
    private String url;

    //如果没有自定义bean的name，则该bean的id默认为方法名
    @Bean(initMethod = "init", destroyMethod = "destory")
    public Store stringStore() {
        return new StringStore();
    }

    @Bean
    public MyDriverManager myDriverManager() {
        return new MyDriverManager(url);
    }
}