package com.commerce.ecommerce.Product;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue()
    private Long id;

    private String name;

    // long text 
    private String desc;

    private String SKU;




    private float price;


    private LocalDateTime timeCreated;

    private LocalDateTime timeModified;

    private LocalDateTime timeDeleted;




}
