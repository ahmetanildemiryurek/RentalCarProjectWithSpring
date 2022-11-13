package com.rentalCarProject.reservation.service.dto;

import com.rentalCarProject.customer.service.dto.CustomerDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor(force = true)
@Getter
@Setter
public class ReservationInputDto {
    private CustomerDto customer;
    private Long id;
    private Long carId;
    private LocalDateTime reservationStart;
    private LocalDateTime reservationFinish;
    private BigDecimal totalAmount;
}
