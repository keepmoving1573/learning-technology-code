package com.huan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
@ComponentScan("com.huan")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
