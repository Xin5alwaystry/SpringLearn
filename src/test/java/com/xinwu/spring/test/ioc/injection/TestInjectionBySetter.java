package com.xinwu.spring.test.ioc.injection;

import com.xinwu.spring.ioc.injection.service.InjectionService;
import com.xinwu.spring.test.base.UnitTestBase;
import org.junit.Test;

/**
 * Created by linxw1 on 2020/1/22.
 *
 * 通过设值注入(setter)
 */
public class TestInjectionBySetter extends UnitTestBase {
    public TestInjectionBySetter() {
        super("classpath:spring-injection-setter.xml");
    }

    @Test
    public void test() {
        InjectionService injectionService = super.getBean("injectionService");
        injectionService.savaData("test injection by setter");
    }
}
