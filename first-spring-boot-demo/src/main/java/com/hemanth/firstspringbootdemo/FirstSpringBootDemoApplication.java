package com.hemanth.firstspringbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringBootDemoApplication.class, args);

        System.out.println("first spring web project in my mega project");
    }

}
