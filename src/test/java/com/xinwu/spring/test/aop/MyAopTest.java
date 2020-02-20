package com.xinwu.spring.test.aop;

import com.xinwu.spring.aop.MyBusiness;
import com.xinwu.spring.test.base.UnitTestBase;
import org.junit.Test;

public class MyAopTest extends UnitTestBase {
    public MyAopTest() {
        super("classpath:spring-aop.xml");
    }

    @Test
    public void testAop() {
        MyBusiness myBusiness = super.getBean("myBusiness");
        myBusiness.testAop();
    }

    @Test
    public void testAopWithArgs() {
        MyBusiness myBusiness = super.getBean("myBusiness");
        myBusiness.testAopWithArgs("test", 222);
    }
}