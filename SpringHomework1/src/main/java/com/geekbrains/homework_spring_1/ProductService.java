package com.geekbrains.homework_spring_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(@Qualifier(value = "productRepository") ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void printAllProduct() {
        List<Product> products = productRepository.getAllProducts();
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
