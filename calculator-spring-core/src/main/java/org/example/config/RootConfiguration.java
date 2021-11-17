package org.example.config;

import org.example.application.Application;
import org.example.entity.Calculator;
import org.example.service.InputService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class RootConfiguration {

    @Bean
    public Calculator getCalculator(){
        return new Calculator();
    }

    @Bean
    public InputService getInputService(){
        return new InputService();
    }

    @Bean("application")
    public Application getApplication(){
        return new Application();
    }
}
