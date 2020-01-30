package com.xinwu.spring.test.annotation;

import com.xinwu.spring.annotation.BeanAnnotation;
import com.xinwu.spring.test.base.UnitTestBase;
import org.junit.Test;

public class TestBeanAnnotation extends UnitTestBase {
    public TestBeanAnnotation() {
        super("classpath:spring-annotation.xml");
    }

    @Test
    public void testComponentAnnotation() {
        BeanAnnotation beanAnnotation = super.getBean("beanAnnotation");
        beanAnnotation.say("test annotation");
    }

    @Test
    public void testScopeAnnotation() {
        BeanAnnotation beanAnnotation1 = super.getBean("beanAnnotation");
        BeanAnnotation beanAnnotation2 = super.getBean("beanAnnotation");

        beanAnnotation1.printHashcode();
        beanAnnotation2.printHashcode();
    }

}