package com.cc.miral.ribbonservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by tomchen on 18/8/29.
 */
@RestController
public class RibbonController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return restTemplate.getForObject("http://testmodel/test",String.class);
    }
}
