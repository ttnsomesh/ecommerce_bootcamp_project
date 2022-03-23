package com.spring.ecommerce.ecommerceapplication.repository;

import com.spring.ecommerce.ecommerceapplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
}
