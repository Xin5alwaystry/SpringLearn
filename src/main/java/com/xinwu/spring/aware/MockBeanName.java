package com.xinwu.spring.aware;

import org.springframework.beans.factory.BeanNameAware;

public class MockBeanName implements BeanNameAware {
    @Override
    public void setBeanName(String beanName) {
        //在初始化bean的时候，可感知到bean的name，此处的name即bean配置中的id
        System.out.println("MockBeanName:" + beanName);
    }
}