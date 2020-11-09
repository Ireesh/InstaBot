package com.geekbrains.spring.homework_two.example.services;

import com.geekbrains.spring.homework_two.example.model.Product;
import com.geekbrains.spring.homework_two.example.repositories.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private Storage storage;

    @Autowired
    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public List<Product> getAllProducts() {
        return storage.getAllProducts();
    }

    public Product getProductById(int id) {
        return storage.getProductById(id);
    }

    public Product saveNewProduct(Product newProduct) {
        return storage.saveNewProduct(newProduct);
    }
}
