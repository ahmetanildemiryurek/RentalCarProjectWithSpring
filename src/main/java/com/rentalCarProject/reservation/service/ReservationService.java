package com.rentalCarProject.reservation.service;


import com.rentalCarProject.reservation.service.dto.ReservationDto;
import com.rentalCarProject.reservation.service.dto.ReservationInputDto;

import java.util.List;

public interface ReservationService {
    List<ReservationDto> getReservations();

    ReservationDto updateReservation(ReservationInputDto reservationDto);

    ReservationDto insertReservation(ReservationInputDto reservationDto);

    ReservationDto getReservation(Long id);

     void removeReservation(Long id);
}
