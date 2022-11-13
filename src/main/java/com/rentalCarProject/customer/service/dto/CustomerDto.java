package com.rentalCarProject.customer.service.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(force = true)
@Getter
@Setter
public class CustomerDto {
    private Long id;
    private String name;
    private String email;
    private String address;
    private int phoneNumber;
    private int identityNumber;
}
