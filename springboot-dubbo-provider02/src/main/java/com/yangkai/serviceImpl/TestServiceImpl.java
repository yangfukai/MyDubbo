package com.yangkai.serviceImpl;

import com.yangkai.service.TestService;

/**
 * @author yangkai on 2018/3/22.
 */
public class TestServiceImpl implements TestService {
    private static final long serialVersionUID = 3710896460707033186L;

    @Override
    public void test(String args) {
        System.out.println("this is provider02!"+args);
    }
}
