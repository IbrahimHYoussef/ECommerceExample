package com.commerce.ecommerce.User;

import java.util.Collections;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;

public enum Role {
    USER(Collections.emptySet()),
    admin(Set.of());

    Role(Set<Object> of) {
        //TODO Auto-generated constructor stub
    }

    public String getAuthorities(){
        return"";
    }

     
}
