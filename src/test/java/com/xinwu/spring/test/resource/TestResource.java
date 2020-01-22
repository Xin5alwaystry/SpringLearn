package com.xinwu.spring.test.resource;

import com.xinwu.spring.resource.MockResource;
import com.xinwu.spring.test.base.UnitTestBase;
import org.junit.Test;

import java.io.IOException;

public class TestResource extends UnitTestBase {
    public TestResource() {
        super("classpath:spring-resource.xml");
    }

    @Test
    public void test() {
        /**
         * spring中的context都间接实现了Resourceloader接口，因此都可以通过其获取Resource
         */
        MockResource mockResource = super.getBean("mockResource");
        //String path = "classpath:test.txt";  //通过classpath获取资源文件
        //String path = "file:/Users/xin5/Desktop/SpringLearn/src/main/resources/test.txt";  //通过文件系统方式获取资源文件
        //String path = "url:https://www.baidu.com/"; 通过url方式获取资源文件
        String path = "test.txt";  //当path没有前缀时，获取资源文件的路径是application的配置文件路径。
        try {
            mockResource.resource(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
