package com.xinwu.spring.ioc.injection.service;

import com.xinwu.spring.ioc.injection.dao.InjectionDao;

/**
 * Created by linxw1 on 2020/1/22.
 */
public class InjectionServiceImpl implements InjectionService {
    private InjectionDao injectionDao;

    //构造器注入。xml配置文件中<constructor-arg>元素中的name参数，实际上对应的是此处构造方法中形参名称。
//    public InjectionServiceImpl(InjectionDao injectionDao) {
//        this.injectionDao = injectionDao;
//    }

    @Override
    public void savaData(String arg) {
        String result = arg + arg.hashCode();
        injectionDao.save(result);
    }

    //设值注入需要有setter方法
    public void setInjectionDao(InjectionDao injectionDao) {
        this.injectionDao = injectionDao;
    }
}
