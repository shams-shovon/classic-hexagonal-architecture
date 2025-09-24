package com.single.module.hexagonal.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataCustomerRepository extends JpaRepository<CustomerEntity, Long> {

}
