package com.xinwu.spring.test.autowire;

import com.xinwu.spring.autowire.AutowireService;
import com.xinwu.spring.test.base.UnitTestBase;
import org.junit.Test;

/**
 * 通过在配置文件的头文件中配置default-autowire参数（no,byType,byName,constructor），来
 * 通过Spring的IoC容器自动装配bean。具体的装配方式可参见文档1.4.5 Autowiring Collaborators
 */
public class TestAutowire extends UnitTestBase {
    public TestAutowire() {
        super("classpath:spring-autowire.xml");
    }

    @Test
    public void test() {
        AutowireService autowireService = super.getBean("autowireService");
        autowireService.saveData("test autowire");
    }
}