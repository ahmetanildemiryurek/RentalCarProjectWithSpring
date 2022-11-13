package com.rentalCarProject.reservation.service.impl;


import com.rentalCarProject.car.domain.Car;
import com.rentalCarProject.car.service.CarService;
import com.rentalCarProject.customer.service.CustomerService;
import com.rentalCarProject.reservation.domain.Reservation;
import com.rentalCarProject.reservation.mapper.ReservationMapper;
import com.rentalCarProject.reservation.repository.ReservationRepository;
import com.rentalCarProject.reservation.service.ReservationService;
import com.rentalCarProject.reservation.service.dto.ReservationDto;
import com.rentalCarProject.reservation.service.dto.ReservationInputDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

    @Service
    public class ReservationServiceImpl implements ReservationService {

        private ReservationRepository reservationRepository;

        private CustomerService customerService;

        private CarService carService;
        private ReservationMapper reservationMapper;

        @Autowired
        public  ReservationServiceImpl(ReservationRepository reservationRepository
                , ReservationMapper reservationMapper, CustomerService customerService,CarService carService){
            this.reservationRepository = reservationRepository;
            this.reservationMapper = reservationMapper;
            this.customerService = customerService;
            this.carService = carService;
        }

        @Override
        public List<ReservationDto> getReservations() {
            List<Reservation> reservationList = this.reservationRepository.findAll();
            return this.reservationMapper.toReservationDTO(reservationList);
        }

        @Override
        public ReservationDto updateReservation(ReservationInputDto reservationDto) {
            Reservation reservation = this.reservationMapper.toReservationInput(reservationDto);
            return this.reservationMapper.toReservationDTO(this.reservationRepository.save(reservation));
        }

        @Override
        public ReservationDto insertReservation(ReservationInputDto reservationDto) {
            Reservation reservation = this.reservationMapper.toReservationInput(reservationDto);
            Car car = this.carService.getCar(reservationDto.getCarId());
            reservation.setCar(car);
            return this.reservationMapper.toReservationDTO(this.reservationRepository.save(reservation));
        }

        @Override
        public ReservationDto getReservation(Long id) {
            Optional<Reservation> reservation = this.reservationRepository.findById(id);

            return this.reservationMapper.toReservationDTO(reservation.get());
        }

        @Override
        public void removeReservation(Long id) {

        }

    }

