package com.geekbrains.ireesh.spring.homework.three.demo.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Product {
    public Product() {
    }

    public Product(String title, BigDecimal cost) {
        this.title = title;
        this.cost = cost;
    }

    @Id
    @Column(name = "id")
    private long id;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    private String title;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "cost")
    private BigDecimal cost;
    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }
}
