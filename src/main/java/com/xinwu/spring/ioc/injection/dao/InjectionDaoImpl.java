package com.xinwu.spring.ioc.injection.dao;

/**
 * Created by linxw1 on 2020/1/22.
 */
public class InjectionDaoImpl implements InjectionDao {
    @Override
    public void save(String arg) {
        System.out.println("save data:" + arg);
    }
}
