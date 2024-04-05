package com.commerce.ecommerce.User;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_address")
public class UserAddress {

    @Id
    @GeneratedValue()
    private Long id;

    // connected to user 

    private String addressLine1;
    
    private String addressLine2;

    private String city;
    
    // need to be limited to numbers and 5 letters long
    private String postalCode;

    private String country;

    private String telephone;

    private String mobile;




}
