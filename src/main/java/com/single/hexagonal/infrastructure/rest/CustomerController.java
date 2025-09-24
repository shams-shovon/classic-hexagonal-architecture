package com.single.hexagonal.infrastructure.rest;

import com.single.hexagonal.application.port.in.CustomerUseCase;
import com.single.hexagonal.domain.model.Customer;
import com.single.hexagonal.infrastructure.rest.dto.CreateCustomerRequest;
import com.single.hexagonal.infrastructure.rest.dto.CustomerDto;
import com.single.hexagonal.infrastructure.rest.mapper.CustomerMapper;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerUseCase service;
    private final CustomerMapper mapper;

    public CustomerController(CustomerUseCase service, CustomerMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity<CustomerDto> create(@RequestBody @Valid CreateCustomerRequest req) {
        Customer created = service.createCustomer(req.getName());
        return ResponseEntity.ok(mapper.toDto(created));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDto> get(@PathVariable Long id) {
        return ResponseEntity.ok(mapper.toDto(service.getCustomer(id)));
    }
}