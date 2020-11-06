package com.geekbrains.homework_spring_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ProductService productService = context.getBean("productService", ProductService.class);
        ProductRepository productRepository = context.getBean("productRepository", ProductRepository.class);
        Cart cart = context.getBean("cart", Cart.class);
        Cart cart2 = context.getBean("cart", Cart.class);
        cart.addProduct(productRepository.getProductById(1));
        cart2.addProduct(productRepository.getProductById(2));
        System.out.println("The first cart:");
        cart.printAllProducts();
        System.out.println("The second cart:");
        cart2.printAllProducts();
        System.out.println("The list of products on a storage:");
        productService.printAllProduct();

    }
}
