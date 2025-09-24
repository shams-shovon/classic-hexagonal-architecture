package com.single.module.hexagonal.application.port.in;

import com.single.module.hexagonal.domain.model.Customer;

public interface CustomerUseCase {
    Customer createCustomer(String name);

    Customer getCustomer(Long id);
}
