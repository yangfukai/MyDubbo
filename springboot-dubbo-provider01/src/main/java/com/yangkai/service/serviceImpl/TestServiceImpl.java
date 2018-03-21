package com.yangkai.service.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yangkai.service.TestService;

@Service(version = "1.0.0")
public class TestServiceImpl implements TestService {

    private static final long serialVersionUID = 3045464396389156347L;

    @Override
    public void test(String args) {
        System.out.println("args:"+args);
    }
}
