package com.xinwu.spring.test.annotation;

import com.xinwu.spring.annotation.jsr.JsrService;
import com.xinwu.spring.test.base.UnitTestBase;
import org.junit.Test;

public class TestJsr extends UnitTestBase {
    public TestJsr() {
        super("classpath:spring-annotation.xml");
    }

    @Test
    public void testJsrResource() {
        JsrService jsrService = super.getBean("jsrService");
        jsrService.save("test jsr");
    }

    @Test
    public void testString() {
        StringBuilder sb = new StringBuilder("");
        sb.append("   aaa \n");
        sb.append("     bbb          \n");
        sb.append("ccc  \n");
        sb.append("\n");
        sb.append("ddd\r\n");
        sb.append("\r\n");
        sb.append("eee\n");

        String text = sb.toString();
        System.out.println("---Original---");
        System.out.println(text);

        System.out.println("---Split---");
        int count = 1;
        String[] lines = text.split("\\r?\\n");
        for (String line : lines) {
            System.out.println("line " + count++ + " : " + line);
        }
    }
}