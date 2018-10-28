package com.cc.miral.feignservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by tomchen on 18/9/5.
 */
@FeignClient(value = "testmodel")
public interface TestServiceI {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    String sayHiFromClientOne();
}
