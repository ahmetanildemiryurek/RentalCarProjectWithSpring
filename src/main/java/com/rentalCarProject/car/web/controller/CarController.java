package com.rentalCarProject.car.web.controller;

import com.rentalCarProject.car.service.CarService;
import com.rentalCarProject.car.service.dto.CarDto;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name= "Car Controller")
@RequestMapping("/car")
@RestController
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService){
        this.carService = carService;
    }

    @Schema(description = "Get Car List")
    @GetMapping("/")
    public ResponseEntity<List<CarDto>> getCarList(){
        List<CarDto> carDTOList = this.carService.getCars();
        return  new ResponseEntity<>(carDTOList, HttpStatus.OK);
    }
    @Schema(description = "Insert Car")
    @PostMapping("/")
    public ResponseEntity<CarDto>insertCar(CarDto carDto){
        carDto = this.carService.insertCar(carDto);
        return new ResponseEntity<>(carDto,HttpStatus.OK);
    }
    @Schema(description = "Delete Car")
    @DeleteMapping("/")
    public void removeCar(Long id){
         this.carService.removeCar(id);
    }
    @Schema(description = "Update Car")
    @PutMapping("/")
    public ResponseEntity<CarDto>updateCar(CarDto carDto){
        carDto = this.carService.updateCar(carDto);
        return new ResponseEntity<>(carDto,HttpStatus.OK);
    }


}
