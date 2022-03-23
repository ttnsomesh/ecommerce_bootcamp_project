package com.spring.ecommerce.ecommerceapplication.entity;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Admin extends User{

    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}