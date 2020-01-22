package com.xinwu.spring.ioc.interfaces;

/**
 * Created by linxw1 on 2020/1/22.
 */
public class OneInterfaceImpl implements OneInterface {
    @Override
    public void say(String msg) {
        System.out.println("OneInterface Implement say:" + msg);
    }
}
