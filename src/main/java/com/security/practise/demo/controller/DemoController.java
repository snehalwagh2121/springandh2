package com.security.practise.demo.controller;

import com.security.practise.demo.service.DemoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    DemoServiceImpl demoService;

    @GetMapping("/validateDB")
    public boolean isDbAccessible(){
        return demoService.isDbAccessible();
    }
}
