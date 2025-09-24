package com.single.module.hexagonal.application.port.out;

import com.single.module.hexagonal.domain.model.Customer;

import java.util.Optional;

public interface CustomerRepositoryPort {
    Customer save(Customer customer);

    Optional<Customer> findById(Long id);
}
