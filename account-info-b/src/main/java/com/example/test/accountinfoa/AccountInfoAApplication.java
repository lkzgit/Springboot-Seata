package com.example.test.accountinfoa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AccountInfoAApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountInfoAApplication.class, args);
    }

}
