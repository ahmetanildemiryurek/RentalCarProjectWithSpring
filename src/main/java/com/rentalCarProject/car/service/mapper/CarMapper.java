package com.rentalCarProject.car.service.mapper;

import com.rentalCarProject.car.domain.Car;
import com.rentalCarProject.car.service.dto.CarDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {

    CarMapper  INSTANCE = Mappers.getMapper(CarMapper.class);

    CarDto toCarDTO(Car car);

    List<CarDto> toCarDTO(List<Car> car);

    Car toCar(CarDto carDto);
}
