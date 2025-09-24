package com.single.hexagonal.infrastructure.persistence;

import com.single.hexagonal.domain.model.Customer;
import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public CustomerEntity() {
    }

    public CustomerEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Customer toDomain() {
        return new Customer(id, name);
    }

    public static CustomerEntity fromDomain(Customer customer) {
        return new CustomerEntity(customer.getId(), customer.getName());
    }
}
