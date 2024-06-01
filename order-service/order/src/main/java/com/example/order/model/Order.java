package com.example.order.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long productId;
    private Long userId;
    private Integer quantity;
    private Double totalPrice;
    private String status;
    private Date orderDate;

    // Getters and Setters

    public long getProductId() {
        return this.productId;
    }

    public long getUserId() {
        return this.userId;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public Double getTotalPrice() {
        return this.totalPrice;
    }

    public String getStatus() {
        return this.status;
    }

    public Date getOrderDate() {
        return this.orderDate;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setQuantity(Integer quantity) {

        this.quantity = quantity;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
