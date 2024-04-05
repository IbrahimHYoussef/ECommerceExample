package com.commerce.ecommerce.Shoping;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="shopping_session")
public class ShoppingSession {
    @Id
    @GeneratedValue()
    public Long id;

    // connected to user

    public Float total;

    private LocalDateTime timeCreated;

    private LocalDateTime timeModified;



}
