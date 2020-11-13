package com.geekbrains.ireesh.spring.homework.three.demo.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "order")
public class Order {
    public Order(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date")
    private Date date;
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "fair_price")
    private BigDecimal fairPrice;
    public BigDecimal getFairPrice() {
        return fairPrice;
    }

    public void setFairPrice(BigDecimal fairPrice) {
        this.fairPrice = fairPrice;
    }

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
}
