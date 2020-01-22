package com.xinwu.spring.test.ioc.injection;

import com.xinwu.spring.ioc.injection.service.InjectionService;
import com.xinwu.spring.test.base.UnitTestBase;
import org.junit.Test;

/**
 * Created by linxw1 on 2020/1/22.
 */
public class TestInjectionByConstructor extends UnitTestBase {
    public TestInjectionByConstructor() {
        super("classpath:spring-injection-constructor.xml");
    }

    @Test
    public void test() {
        InjectionService injectionService = super.getBean("injectionService");
        injectionService.savaData("test injection by constructor");
    }
}
