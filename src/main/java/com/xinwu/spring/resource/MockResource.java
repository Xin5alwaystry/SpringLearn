package com.xinwu.spring.resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

import java.io.IOException;

public class MockResource implements ApplicationContextAware {
    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //实现了applicationAware接口，该bean在创建时能够获取applicationContext的引用
        this.context = applicationContext;
    }

    public void resource(String path) throws IOException {
        Resource resource = context.getResource(path);
        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());
    }
}
