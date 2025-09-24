package com.single.hexagonal.application.port.in;

import com.single.hexagonal.domain.model.Customer;

public interface CustomerUseCase {
    Customer createCustomer(String name);

    Customer getCustomer(Long id);
}
