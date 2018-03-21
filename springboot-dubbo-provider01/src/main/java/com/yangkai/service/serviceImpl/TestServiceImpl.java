package com.yangkai.service.serviceImpl;

import com.yangkai.service.TestService;

public class TestServiceImpl implements TestService {

    @Override
    public void test(String args) {
        System.out.println("args:"+args);
    }
}
