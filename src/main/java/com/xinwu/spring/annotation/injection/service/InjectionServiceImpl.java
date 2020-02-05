package com.xinwu.spring.annotation.injection.service;

import com.xinwu.spring.annotation.injection.dao.InjectionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by linxw1 on 2020/1/22.
 */
@Service
public class InjectionServiceImpl implements InjectionService {
    private InjectionDao injectionDao;

    @Override
    public void savaData(String arg) {
        String result = arg + arg.hashCode();
        injectionDao.save(result);
    }

    @Autowired
    public InjectionServiceImpl(InjectionDao injectionDao) {
        this.injectionDao = injectionDao;
    }

    public void setInjectionDao(InjectionDao injectionDao) {
        this.injectionDao = injectionDao;
    }
}
