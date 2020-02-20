package com.xinwu.spring.test.annotation;

import com.xinwu.spring.annotation.BeanAnnotation;
import com.xinwu.spring.annotation.injection.service.InjectionService;
import com.xinwu.spring.annotation.javabased.MyDriverManager;
import com.xinwu.spring.annotation.javabased.Store;
import com.xinwu.spring.annotation.multibean.BeanInvoker;
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

    @Test
    public void testAutowireByField() {
        //@Autowired注解在成员变量上
        InjectionService injectionService = super.getBean("injectionServiceImpl");
        injectionService.savaData("test autowire annotation by field");
    }

    @Test
    public void testAutowiredBySetter() {
        //@Autowired注解在成员变量的set方法上
        InjectionService injectionService = super.getBean("injectionServiceImpl");
        injectionService.savaData("test autowire annotation by set method");
    }

    @Test
    public void testAutowiredByConstructor() {
        //@Autowired注解在构造方法上
        InjectionService injectionService = super.getBean("injectionServiceImpl");
        injectionService.savaData("test autowire annotation by constructor method");
    }

    @Test
    public void testMultiBean() {
        BeanInvoker beanInvoker = super.getBean("beanInvoker");
        beanInvoker.say();
    }

    @Test
    public void testBeanAnnotation() {
        Store store = super.getBean("stringStore");
        System.out.println(store.getClass().getName());
    }

    @Test
    public void testMyDriverManager() {
        MyDriverManager myDriverManager = super.getBean("myDriverManager");
    }
}