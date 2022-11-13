package com.rentalCarProject.customer.repository;

import com.rentalCarProject.car.domain.Car;
import com.rentalCarProject.customer.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CustomerRepository extends JpaRepository<Customer, Long >, JpaSpecificationExecutor<Customer> {
}
