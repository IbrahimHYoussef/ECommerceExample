package com.commerce.ecommerce.Shoping;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

@Entity
@Table(name="cart_item")
public class CartItem {
    @Id
    @GeneratedValue()
    private Long id;
    // Connected to session and and product id 


    private int quantity;

    private LocalDateTime timeCreated;

    private LocalDateTime timeModified;




}
