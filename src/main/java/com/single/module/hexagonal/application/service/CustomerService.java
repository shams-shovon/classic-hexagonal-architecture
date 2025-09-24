package com.single.module.hexagonal.application.service;

import com.single.module.hexagonal.application.port.in.CustomerUseCase;
import com.single.module.hexagonal.application.port.out.CustomerRepositoryPort;
import com.single.module.hexagonal.domain.exception.DomainException;
import com.single.module.hexagonal.domain.model.Customer;

public class CustomerService implements CustomerUseCase {
    private final CustomerRepositoryPort repository;

    public CustomerService(CustomerRepositoryPort repository) {
        this.repository = repository;
    }

    @Override
    public Customer createCustomer(String name) {
        return repository.save(new Customer(null, name));
    }

    @Override
    public Customer getCustomer(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new DomainException("Customer not found"));
    }
}
