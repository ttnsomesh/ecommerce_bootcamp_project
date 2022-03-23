package com.spring.ecommerce.ecommerceapplication.entity;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Customer extends User{

    @Id
    private Long id;

    @Column(name = "contact_number")
    private String contactNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
