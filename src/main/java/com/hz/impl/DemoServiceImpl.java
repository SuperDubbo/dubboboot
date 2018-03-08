package com.hz.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hz.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        System.out.println("AAAAAAAAAAAAAA");
        return "Hello";
    }
}
