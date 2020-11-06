package com.geekbrains.homework_spring_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Cart cart() {
        return new Cart();
    }

    @Bean
    public ProductService productService() {
        return new ProductService();
    }
}