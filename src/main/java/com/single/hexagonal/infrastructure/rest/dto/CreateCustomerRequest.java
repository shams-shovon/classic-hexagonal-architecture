package com.single.hexagonal.infrastructure.rest.dto;

import jakarta.validation.constraints.NotBlank;

public class CreateCustomerRequest {
    @NotBlank
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateCustomerRequest() {
    }

    public CreateCustomerRequest(String name) {
        this.name = name;
    }
}
