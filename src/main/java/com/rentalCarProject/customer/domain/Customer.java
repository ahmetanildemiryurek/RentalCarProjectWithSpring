package com.rentalCarProject.customer.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME" , nullable = false , length = 50)
    private String name;

    @Column(name = "IDENTITYNUMBER" , nullable = false )
    private int identityNumber;

    @Column(name = "PHONENUMBER" , nullable = false )
    private int phoneNumber;

    @Column(name = "ADDRESS" , nullable = false , length = 255)
    private String address;


    @Column(name = "EMAIL" , nullable = false , length = 50)
    private String email;


}
