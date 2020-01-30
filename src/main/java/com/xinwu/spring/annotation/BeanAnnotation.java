package com.xinwu.spring.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 使用@Component注解如没有显示指定name属性，那么bean的id生成策略为类名的首字母小写
 * 使用@Scope注解可以指定bean生成策略。
 */
@Scope("singleton")
@Component
public class BeanAnnotation {
    public void say(String msg) {
        System.out.println("BeanAnnotation:" + msg);
    }

    public void printHashcode() {
        System.out.println(this.hashCode());
    }
}