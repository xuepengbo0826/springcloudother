package com.example.springcloudeurekaonezoneoneservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudeurekaonezoneoneserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudeurekaonezoneoneserviceApplication.class, args);
    }
}
