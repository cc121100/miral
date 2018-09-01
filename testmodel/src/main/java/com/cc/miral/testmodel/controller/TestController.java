package com.cc.miral.testmodel.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tomchen on 18/8/29.
 */
@RestController
public class TestController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/test")
    public String test(){
        return "test from:" + port;
    }

}
