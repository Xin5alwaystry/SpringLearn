package com.xinwu.spring.annotation.jsr;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Service
public class JsrService {
    @Resource
    private JsrDao jsrDao;

    public void save(String msg) {
        this.jsrDao.save(msg);
    }

    @PostConstruct
    public void init() {
        System.out.println("This is jsrService init method!");
    }

    @PreDestroy
    public void destory() {
        System.out.println("This is jsrService destory method!");
    }
}