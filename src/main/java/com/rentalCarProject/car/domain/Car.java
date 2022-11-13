package com.rentalCarProject.car.domain;


import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter

public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "BRAND" , nullable = false , length = 255)
    private String brand;

    @Column(name = "MODEL" , nullable = false , length = 60)
    private String model;

    @Column(name = "FUELTYPE" , nullable = false , length = 12)
    private String fuelType;

    @Column(name = "SEGMENT" , nullable = false , length = 10)
    private String segment;

    @Column(name = "CAPACITY" , nullable = false )
    private int capacity;

    @Column(name = "VEHICLETYPE" , nullable = false , length = 50)
    private String vehicleType;

    @Column(name = "ISACTIVE" , nullable = false )
    private Boolean isActive;

    @Column(name = "AMOUNT" , nullable = false )
    private BigDecimal amount;


}
