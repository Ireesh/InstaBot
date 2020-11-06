package com.geekbrains.homework_spring_1;

public class Product {
    private int id;
    private String productName;
    private int price;

    public Product() {};

    public Product(int id, String productName, int price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return productName;
    }

    public void setName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Product %d: %s (%d$)", id, productName, price);
    }

}
