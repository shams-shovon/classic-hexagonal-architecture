package com.single.module.hexagonal.infrastructure.config;

import com.single.module.hexagonal.application.port.in.CustomerUseCase;
import com.single.module.hexagonal.application.port.out.CustomerRepositoryPort;
import com.single.module.hexagonal.application.service.CustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public CustomerUseCase customerService(CustomerRepositoryPort repository) {
        return new CustomerService(repository);
    }
}
