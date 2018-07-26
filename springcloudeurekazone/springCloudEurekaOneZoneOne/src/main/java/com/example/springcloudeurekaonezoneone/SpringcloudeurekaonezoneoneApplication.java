package com.example.springcloudeurekaonezoneone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudeurekaonezoneoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudeurekaonezoneoneApplication.class, args);
    }
}
