package com.geekbrains.ireesh.spring.homework.three.demo.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {

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
    @Column(name = "name")
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }
}
