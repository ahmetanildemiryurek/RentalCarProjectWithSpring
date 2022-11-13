package com.rentalCarProject.customer.service;

import com.rentalCarProject.car.service.dto.CarDto;
import com.rentalCarProject.customer.service.dto.CustomerDto;

import java.util.List;

public interface CustomerService {

    List<CustomerDto> getCustomers();

    CustomerDto updateCustomer(CustomerDto carDTO);

    CustomerDto insertCustomer(CustomerDto carDTO);

    CustomerDto getCustomer(Long id);

    void removeCustomer(Long id);
}
