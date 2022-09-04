package com.example.springdemo.config;

import com.example.springdemo.Test;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {


    @Bean
    public Test getTestBean() {
        Test test = new Test();
        return test;
    }
}