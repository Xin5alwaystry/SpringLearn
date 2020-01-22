package com.xinwu.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MockApplicationContext implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //通过实现ApplicationContextAware接口，实现在容器初始化的时候，将applicationContextAware注入bean中。即"感知"aware到applicationContext
        System.out.println("MockApplicationContext setApplicationContext:" + applicationContext.getBean("mockApplicationContext").hashCode());
    }
}