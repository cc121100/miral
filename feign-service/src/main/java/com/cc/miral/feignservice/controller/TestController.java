package com.cc.miral.feignservice.controller;

import com.cc.miral.feignservice.service.TestServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tomchen on 18/9/5.
 */
@RestController
public class TestController {

    @Autowired
    TestServiceI testServiceI;

    @GetMapping(value = "/feign-test")
    public String sayHi() {
        return testServiceI.sayHiFromClientOne();
    }
}
