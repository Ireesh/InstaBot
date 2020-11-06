package com.geekbrains.homework_spring_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ProductService productService = context.getBean("productService", ProductService.class);
        Cart cart = context.getBean("cart", Cart.class);
        productService.printAllProducts();
    }
}
