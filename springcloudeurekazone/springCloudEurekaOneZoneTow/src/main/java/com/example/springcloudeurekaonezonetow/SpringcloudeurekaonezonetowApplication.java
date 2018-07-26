package com.example.springcloudeurekaonezonetow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudeurekaonezonetowApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudeurekaonezonetowApplication.class, args);
    }
}
