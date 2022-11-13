package com.rentalCarProject.reservation.service.dto;

import com.rentalCarProject.car.domain.Car;
import com.rentalCarProject.car.service.dto.CarDto;
import com.rentalCarProject.customer.domain.Customer;
import com.rentalCarProject.customer.service.dto.CustomerDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor(force = true)
@Getter
@Setter
public class ReservationDto {
    private CarDto car;
    private CustomerDto customer;
    private Long id;
    private LocalDateTime reservationStart;
    private LocalDateTime reservationFinish;
    private BigDecimal totalAmount;

}
