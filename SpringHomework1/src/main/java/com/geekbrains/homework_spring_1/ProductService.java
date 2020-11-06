package com.geekbrains.homework_spring_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {
    private Repository repository;

    @Autowired
    public void setProductRepository(@Qualifier(value = "ProductRepository") Repository repository) {
        this.repository = repository;
    }

    public void printAllProducts() {
        List<Product> products = repository.getAllProducts();
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
