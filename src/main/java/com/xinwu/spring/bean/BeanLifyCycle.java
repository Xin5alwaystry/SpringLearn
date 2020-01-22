package com.xinwu.spring.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 定义bean的初始化和销毁方法的三种方式
 * 1，实现InitializingBean, DisposableBean接口，分别实现afterPropertiesSet和destroy方法
 * 2，在bean的配置中配置init-method和destory-method参数，以此指定初始化和销毁方法
 * 3，在配置文件的头文件中配置default-init-method和default-destory-method，来定义全局初始化和销毁方法
 *
 * 如果三种方式都实现的话，执行顺序是：afterPropertiesSet和destroy方法，bean参数指定的初始化和销毁方法，全局初始化方法和销毁方法不执行
 * Tip：全局初始化和销毁方法不是必须的，即如果配置了全局初始化和销毁方法，而bean没有实现对应的方法，也不会报错
 */
public class BeanLifyCycle implements InitializingBean, DisposableBean {
    public void beanInit() {
        System.out.println("do init method");
    }

    public void beanDestory() {
        System.out.println("do destory method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("implement InitializingBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("implement DisposableBean");
    }

    public void defaultInit() {
        System.out.println("do default init method");
    }

    public void defaultDestory() {
        System.out.println("do default destory method");
    }
}