package com.single.hexagonal.application.port.out;

import com.single.hexagonal.domain.model.Customer;

import java.util.Optional;

public interface CustomerRepositoryPort {
    Customer save(Customer customer);

    Optional<Customer> findById(Long id);
}
