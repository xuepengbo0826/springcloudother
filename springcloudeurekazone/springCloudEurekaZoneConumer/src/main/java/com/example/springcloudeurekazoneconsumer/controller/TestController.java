package com.example.springcloudeurekazoneconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: xuepengbo
 * @Date: 2018/7/26 15:38
 * @Description:
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping(value = "sayHello")
    public String sayHello(){
        return restTemplate.getForObject("http://SpringCloudEurekaOneZoneOneService/test/sayHello", String.class);
    }
}
