package com.rentalCarProject.customer.service.mapper;

import com.rentalCarProject.customer.domain.Customer;
import com.rentalCarProject.customer.service.dto.CustomerDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDto toCustomerDTO(Customer customer);


    List<CustomerDto> toCustomerDTO(List<Customer> customer);

    Customer toCustomer(CustomerDto customerDto);
}