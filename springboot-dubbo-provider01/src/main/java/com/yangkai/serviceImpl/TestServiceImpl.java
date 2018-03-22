package com.yangkai.serviceImpl;

import com.yangkai.service.TestService;

public class TestServiceImpl implements TestService {

    private static final long serialVersionUID = 3045464396389156347L;

    @Override
    public void test(String args) {
        System.out.println("args:"+args);
    }
}
