package com.yangkai.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yangkai.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yangkai on 2018/3/22.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Reference(version = "0.0.1",check = false)
    private TestService testService;

    @GetMapping("/mytest")
    public @ResponseBody String test(@RequestParam("data") String data){
        testService.test(data);
        return data;
    }
}
