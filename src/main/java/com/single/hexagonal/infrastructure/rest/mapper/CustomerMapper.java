package com.single.hexagonal.infrastructure.rest.mapper;

import com.single.hexagonal.domain.model.Customer;
import com.single.hexagonal.infrastructure.rest.dto.CreateCustomerRequest;
import com.single.hexagonal.infrastructure.rest.dto.CustomerDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerDto toDto(Customer customer);

    Customer fromDto(CustomerDto dto);

    Customer fromCreateRequest(CreateCustomerRequest request);
}
