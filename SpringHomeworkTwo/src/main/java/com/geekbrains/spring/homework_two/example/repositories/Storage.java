package com.geekbrains.spring.homework_two.example.repositories;

import com.geekbrains.spring.homework_two.example.model.Product;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class Storage {
    private List<Product> products;
    private int maxId;

    @PostConstruct
    public void init() {
        this.products = new ArrayList<>();
        this.products.add(new Product(1, "Apple", 2.1));
        this.products.add(new Product(2, "Orange", 2.5));
        this.products.add(new Product(3, "Kiwi", 1.8));
        this.maxId = 3;
    }

    public List<Product> getAllProducts() {
        return Collections.unmodifiableList(products);
    }

    public Product getProductById(int id) {
        for (Product pr : products) {
            if (pr.getId() == id) {
                return pr;
            }
        }
        throw new RuntimeException("Product not found");
    }

    public Product saveNewProduct(Product newProduct) {
        if (newProduct.getId() == 0) {
            maxId++;
            newProduct.setId(maxId);
            products.add(newProduct);
            return newProduct;
        } else {
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getId() == newProduct.getId()) {
                    products.set(i, newProduct);
                    return newProduct;
                }
            }
        }
        throw new RuntimeException("The product cannot be added");
    }
}
