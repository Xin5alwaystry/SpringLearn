package com.xinwu.spring.test.ioc.interfaces;

import com.xinwu.spring.ioc.interfaces.OneInterface;
import com.xinwu.spring.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by linxw1 on 2020/1/22.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestOneInterface extends UnitTestBase {
    public TestOneInterface() {
        super("classpath*:spring-ioc.xml");
    }

    @Test
    public void testSay() {
        OneInterface oneInterface = super.getBean("oneInterface");
        oneInterface.say("test ioc");
    }
}
