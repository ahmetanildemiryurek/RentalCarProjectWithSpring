package com.rentalCarProject.reservation.web.controller;

import com.rentalCarProject.car.service.CarService;
import com.rentalCarProject.car.service.dto.CarDto;
import com.rentalCarProject.reservation.service.ReservationService;
import com.rentalCarProject.reservation.service.dto.ReservationDto;
import com.rentalCarProject.reservation.service.dto.ReservationInputDto;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name= "Reservation Controller")
@RequestMapping("/reservation")
@RestController
public class ReservationController {

    private final ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService){
        this.reservationService = reservationService;
    }

    @Schema(description = "Get Reservation List")
    @GetMapping("/")
    public ResponseEntity<List<ReservationDto>> getReservationList(){
        List<ReservationDto> ReservationDtoList = this.reservationService.getReservations();
        return  new ResponseEntity<>(ReservationDtoList, HttpStatus.OK);
    }

    @Schema(description = "Insert Reservation")
    @PostMapping("/")
    public ResponseEntity<ReservationDto>insertReservation(ReservationInputDto reservationInputDto){
        ReservationDto reservationDto = this.reservationService.insertReservation(reservationInputDto);
        return new ResponseEntity<>(reservationDto,HttpStatus.OK);
    }

    @Schema(description = "Delete Reservation")
    @DeleteMapping("/")
    public void removeReservation(Long id){
        this.reservationService.removeReservation(id);
    }

    @Schema(description = "Update Reservation")
    @PutMapping("/")
    public ResponseEntity<ReservationDto>uptadeReservation(ReservationInputDto reservationInputDto){
        ReservationDto reservationDto = this.reservationService.updateReservation(reservationInputDto);
        return new ResponseEntity<>(reservationDto,HttpStatus.OK);
    }


}
