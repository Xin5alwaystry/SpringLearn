package com.xinwu.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void before() {
        System.out.println("MyAspect before");
    }

    //正常返回，抛出异常时不会执行
    public void afterReturning() {
        System.out.println("MyAspect after returning");
    }

    public void afterThrowing() {
        System.out.println("MyAspect after throwing");
    }

    //无论如何都回返回
    public void afterFinally() {
        System.out.println("MyAspect after finally");
    }

    //环绕通知，根据具体情况选择处理异常的方式
    public Object around(ProceedingJoinPoint pjp){
        Object result = null;
        System.out.println("MyAspect aroud advise round1");
        try {
            result = pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("MyAspect aroud advise round2");
        return result;
    }

    //可以配置参数
    public Object aroundWithArgs(ProceedingJoinPoint pjp, String args1, Integer args2) {
        System.out.println("MyAspect around with args:" + args1 + " " + args2);
        Object result = null;
        System.out.println("MyAspect aroud with args round1");
        try {
            result = pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("MyAspect aroud with args round2");
        return result;
    }
}