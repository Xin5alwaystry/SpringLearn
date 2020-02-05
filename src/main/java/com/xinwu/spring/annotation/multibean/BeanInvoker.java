package com.xinwu.spring.annotation.multibean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * - 可以通过添加@autowired注解给集合成员变量或其set方法，以提供ApplicationContext中的所有特定类的bean
 * -- 如List
 *
 * - 可以用于装配key为String的Map，key为bean的id
 *
 * - 如果希望集合有序，可以让bean实现org.springframework.core.Ordered接口或者使用@Order注解
 */
@Component
public class BeanInvoker {
    @Autowired
    private List<BeanInterface> list;
    @Autowired
    private Map<String, BeanInterface> map;

    public void say() {
        if (null != list && 0 != list.size()) {
            for (BeanInterface beanInterface : list) {
                System.out.println(beanInterface.getClass().getName());
            }
        } else {
            System.out.println("List<BeanInterface> list is null!");
        }

        if (null != map && 0 != map.size()) {
            for (Map.Entry entry : map.entrySet()) {
                System.out.println(String.format("key: %s  value: %s", entry.getKey(), entry.getValue()));
            }
        } else {
            System.out.println("Map<String, BeanInterface> map is null!");
        }
    }
}