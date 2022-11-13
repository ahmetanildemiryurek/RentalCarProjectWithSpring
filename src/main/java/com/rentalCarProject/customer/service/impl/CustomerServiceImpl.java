package com.rentalCarProject.customer.service.impl;

import com.rentalCarProject.car.domain.Car;
import com.rentalCarProject.customer.domain.Customer;
import com.rentalCarProject.customer.repository.CustomerRepository;
import com.rentalCarProject.customer.service.CustomerService;
import com.rentalCarProject.customer.service.dto.CustomerDto;
import com.rentalCarProject.customer.service.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;

    @Autowired
    public  CustomerServiceImpl(CustomerRepository customerRepository
            ,CustomerMapper customerMapper){
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Override
    public List<CustomerDto> getCustomers() {
        List<Customer> customerList = this.customerRepository.findAll();
        return this.customerMapper.toCustomerDTO(customerList);
    }

    @Override
    public CustomerDto updateCustomer(CustomerDto customerDto) {
        Customer customer= this.customerMapper.toCustomer(customerDto);
        return this.customerMapper.toCustomerDTO(this.customerRepository.save(customer));
    }

    @Override
    public CustomerDto insertCustomer(CustomerDto customerDto) {
        Customer customer = this.customerMapper.toCustomer(customerDto);
        return this.customerMapper.toCustomerDTO(this.customerRepository.save(customer));
    }

    @Override
    public CustomerDto getCustomer(Long id) {
        Optional<Customer> customer = this.customerRepository.findById(id);

        return this.customerMapper.toCustomerDTO(customer.get());
    }

    @Override
    public void removeCustomer(Long id){
        this.customerRepository.deleteById(id);
    }
}
