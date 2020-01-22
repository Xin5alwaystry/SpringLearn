package com.xinwu.spring.bean;

/**
 * Created by linxw1 on 2020/1/22.
 */
public class BeanScope {
    public void say() {
        System.out.println("test bean scope:" + this.hashCode());
    }
}
