package com.geekbrains.homework_spring_1;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Cart {
    List<Product> products;

    public Cart() {
        this.products = new ArrayList<Product>();
    };

    public void addProduct(Product product) {
        products.add(product);
    }

    public void deleteProductById(int id) {
        for (Product product : products) {
            int temp = product.getId();
            if (temp == id) {
                products.remove(product);
            }
        }
    }
}

