package com.xinwu.spring.test.aware;

import com.xinwu.spring.aware.MockCombineAware;
import com.xinwu.spring.test.base.UnitTestBase;
import org.junit.Test;

public class TestCombineAware extends UnitTestBase {
    public TestCombineAware() {
        super("classpath:spring-combine-aware.xml");
    }

    @Test
    public void test() {
        MockCombineAware mockCombineAware = super.getBean("mockCombineAware");
        System.out.println("TestCombineAware:" + mockCombineAware.hashCode());
    }
}