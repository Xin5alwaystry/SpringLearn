package com.xinwu.spring.test.aware;

import com.xinwu.spring.test.base.UnitTestBase;
import org.junit.Test;

public class TestApplicationContextAware extends UnitTestBase {
    public TestApplicationContextAware() {
        super("classpath:spring-application-context-aware.xml");
    }

    @Test
    public void test() {
        System.out.println("test" + super.getBean("mockApplicationContext").hashCode());
    }
}