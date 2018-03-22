package com.yangkai.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yangkai.service.TestService;

/**
 * @author yangkai on 2018/3/22.
 */
@Service(version = "0.0.1")
public class TestServiceImpl implements TestService {
    private static final long serialVersionUID = 3710896460707033186L;

    @Override
    public void test(String args) {
        System.out.println("this is provider02!"+args);
    }
}
