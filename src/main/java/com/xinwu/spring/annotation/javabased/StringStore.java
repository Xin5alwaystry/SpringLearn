package com.xinwu.spring.annotation.javabased;

public class StringStore implements Store {
    public void init() {
        System.out.println("This is init method!");
    }

    public void destory() {
        System.out.println("This is destory method!");
    }
}