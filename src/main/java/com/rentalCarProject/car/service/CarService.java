package com.rentalCarProject.car.service;

import com.rentalCarProject.car.domain.Car;
import com.rentalCarProject.car.service.dto.CarDto;

import java.util.List;

public interface CarService {

    List<CarDto> getCars();

    CarDto updateCar(CarDto carDTO);

    CarDto insertCar(CarDto carDTO);

    CarDto getCarDto(Long id);

    Car getCar(Long id);

    void removeCar(Long id);
}
