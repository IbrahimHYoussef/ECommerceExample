package com.commerce.ecommerce.User;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="user_Payment")
public class UserPayment {

    @Id
    @GeneratedValue()
    private String id;

    private PaymentType paymentType;

    private String Provider;

    private String AccountNumber;

    private LocalDate expireTime;


}
