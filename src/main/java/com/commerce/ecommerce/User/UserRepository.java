package com.commerce.ecommerce.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User,Long> {
    @Query("SELECT p FROM users WHERE p.email=emailNeeded")
    Optional<User> findByEmail(@Param("emailNeeded")String email);

    
}
