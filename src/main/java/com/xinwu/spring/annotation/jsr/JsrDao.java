package com.xinwu.spring.annotation.jsr;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
public class JsrDao {
    @PostConstruct
    public void init() {
        System.out.println("this is jsrDao init method!");
    }

    @PreDestroy
    public void destory() {
        System.out.println("this is jsrDao destory method!");
    }

    public void save(String msg) {
        System.out.println("JsrDao save: " + msg);
    }
}