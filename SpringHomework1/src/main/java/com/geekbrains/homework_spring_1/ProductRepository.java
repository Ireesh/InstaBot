package com.geekbrains.homework_spring_1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@Scope("singleton")
public class ProductRepository implements Repository{
    private List<Product> products;

    @PostConstruct
    public void init() {
        this.products = new ArrayList<Product>();
        this.products.add(new Product(1, "item1", 100));
        this.products.add(new Product(2, "item2", 100));
        this.products.add(new Product(3, "item3", 100));
    }

    public List<Product> getAllProducts() {
        return Collections.unmodifiableList(products);
    }

    public Product getProductById(int id) {
        for (Product product : this.products) {
            int temp = product.getId();
            if(temp == id) return product;
        }
        return null;
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
