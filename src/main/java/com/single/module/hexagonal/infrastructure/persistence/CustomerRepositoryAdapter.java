package com.single.module.hexagonal.infrastructure.persistence;

import com.single.module.hexagonal.application.port.out.CustomerRepositoryPort;
import com.single.module.hexagonal.domain.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CustomerRepositoryAdapter implements CustomerRepositoryPort {
    private final SpringDataCustomerRepository repo;

    public CustomerRepositoryAdapter(SpringDataCustomerRepository repo) {
        this.repo = repo;
    }

    @Override
    public Customer save(Customer customer) {
        return repo.save(CustomerEntity.fromDomain(customer)).toDomain();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return repo.findById(id).map(CustomerEntity::toDomain);
    }
}
