package com.xinwu.spring.test.bean;

import com.xinwu.spring.bean.BeanScope;
import com.xinwu.spring.test.base.UnitTestBase;
import org.junit.Test;

/**
 * Created by linxw1 on 2020/1/22.
 */
public class TestBeanScope extends UnitTestBase {
    public TestBeanScope() {
        super("classpath:spring-bean-scope.xml");
    }

    @Test
    public void test() {
        /**
         * bean的scope作用于有：singleton prototype request session application websocket，具体可参见文档
         * bean的scope为singleton时，则该bean为单例，前提是在同一个容器中；
         * bean的scope为prototype时，则每次通过容器获取的bean都是不同的
         */
        //bean的scope为singleton，通过容器获取的bean为单例。
        //当然，前提是在同一个容器中
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();

        BeanScope beanScop1 = super.getBean("beanScope");
        beanScop1.say();
    }
}
