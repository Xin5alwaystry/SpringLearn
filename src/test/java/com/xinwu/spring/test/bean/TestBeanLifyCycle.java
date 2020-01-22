package com.xinwu.spring.test.bean;

import com.xinwu.spring.bean.BeanLifyCycle;
import com.xinwu.spring.test.base.UnitTestBase;
import org.junit.Test;

public class TestBeanLifyCycle extends UnitTestBase {
    public TestBeanLifyCycle() {
        super("classpath:spring-bean-lifecycle.xml");
    }

    @Test
    public void test() {
        BeanLifyCycle beanLifyCycle = super.getBean("beanLifeCycle");
    }
}