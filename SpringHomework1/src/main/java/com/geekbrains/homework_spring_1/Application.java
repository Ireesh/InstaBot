package com.geekbrains.homework_spring_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ProductRepository productRepository = context.getBean("productRepository", ProductRepository.class);
        Cart cart = context.getBean("cart", Cart.class);
        cart.addProduct(productRepository.getProductById(1));
        cart.printAllProducts();
    }
}
