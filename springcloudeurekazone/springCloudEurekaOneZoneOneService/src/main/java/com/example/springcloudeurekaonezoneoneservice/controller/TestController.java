package com.example.springcloudeurekaonezoneoneservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: xuepengbo
 * @Date: 2018/7/26 15:27
 * @Description:
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping(value = "sayHello")
    public String sayHello(){
        return "zone-1：hello world！";
    }
}
