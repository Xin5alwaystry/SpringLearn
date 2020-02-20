package com.xinwu.spring.aop;

public class MyBusiness {
    public void testAop() {
        System.out.println("MyBusiness test");
//        throw new RuntimeException();
    }

    public void testAopWithArgs(String args1, Integer args2) {
        System.out.println("MyBusiness test: " + args1 + " " + args2);
    }
}