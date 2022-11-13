package com.rentalCarProject.car.service.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
@NoArgsConstructor(force = true)
@Getter
@Setter
public class CarDto implements Serializable {
    private Long id;
    private String brand;
    private String model;
    private String fuelType;
    private String segment;
    private int capacity;
    private String vehicleType;
    private Boolean isActive;
    private BigDecimal amount;
}
