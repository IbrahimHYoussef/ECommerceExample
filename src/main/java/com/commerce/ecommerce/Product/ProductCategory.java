package com.commerce.ecommerce.Product;

import java.time.LocalDateTime;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;


@Entity
@Table(name="product_category")
public class ProductCategory {

    @Id
    @GeneratedValue()
    private String id;

    private String name;

    // Need to be long text
    private String desc;

    private LocalDateTime timeCreated;

    private LocalDateTime timeModified;

    private LocalDateTime timeDeleted;


}
