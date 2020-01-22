package com.xinwu.spring.autowire;

public class AutowireService {
    private AutowireDao autowireDao;

    public void saveData(String msg) {
        System.out.println("AutowireService");
        this.autowireDao.save(msg);
    }

    public void setAutowireDao(AutowireDao autowireDao) {
        this.autowireDao = autowireDao;
    }
}