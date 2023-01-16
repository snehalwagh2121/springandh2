package com.security.practise.demo.service;

import com.security.practise.demo.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService{

    @Autowired
    DemoDao dao;

    public boolean isDbAccessible(){
        return (dao.getUser("snehal") != null);
    }
}
