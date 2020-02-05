package com.xinwu.spring.annotation.injection.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by linxw1 on 2020/1/22.
 */
@Repository
public class InjectionDaoImpl implements InjectionDao {
    @Override
    public void save(String arg) {
        System.out.println("save data:" + arg);
    }
}
