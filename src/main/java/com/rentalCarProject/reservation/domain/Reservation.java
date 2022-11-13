package com.rentalCarProject.reservation.domain;

import com.rentalCarProject.car.domain.Car;
import com.rentalCarProject.customer.domain.Customer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(optional = false )
    @JoinColumn(name = "CAR_ID", nullable = false)
    private Car car;

    @OneToOne(optional = false )
    @JoinColumn(name = "CUSTOMER_ID", nullable = false)
    private Customer customer;

    @Column( name = "RESERVATION_START" , nullable = false  )
    private LocalDateTime reservationStart;

    @Column(name = "RESERVATION_FINISH", nullable = false)
    private LocalDateTime reservationFinish;

    @Column(name = "TOTALAMOUNT" , nullable = false)
    private BigDecimal totalAmount;

}