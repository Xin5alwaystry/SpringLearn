package com.xinwu.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MockCombineAware implements BeanNameAware, ApplicationContextAware {
    private String beanName;

    @Override
    public void setBeanName(String beanName) {
        System.out.println("MockCombineAware getBeanName:" + beanName);
        this.beanName = beanName;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("MockCombineAware getApplicationContext and getBean:" + applicationContext.getBean(this.beanName).hashCode());
    }
}