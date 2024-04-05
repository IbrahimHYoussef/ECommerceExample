package com.commerce.ecommerce.Product;

import java.time.LocalDateTime;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

@Entity
@Table(name="product_inventroy")
public class ProductInventory {
    @Id
    @GeneratedValue()
    private Long id;

    private int quatity;

    private LocalDateTime timeCreated;

    private LocalDateTime timeModified;

    private LocalDateTime timeDeleted;


}
