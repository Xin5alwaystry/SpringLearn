package com.xinwu.spring.test.aware;

import com.xinwu.spring.aware.MockBeanName;
import com.xinwu.spring.test.base.UnitTestBase;
import org.junit.Test;

public class TestBeanNameAware extends UnitTestBase {
    public TestBeanNameAware() {
        super("classpath:spring-beanname-aware.xml");
    }

    @Test
    public void test() {
        MockBeanName mockBeanName = super.getBean("mockBeanName");
        System.out.println("TestBeanNameAware:" + mockBeanName.hashCode());
    }
}