package com.example.order.model;

import javax.persistence.*;
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
}
