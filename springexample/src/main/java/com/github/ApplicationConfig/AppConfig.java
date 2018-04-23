package com.github.ApplicationConfig;

import com.github.repository.HibernateCustomerRepository;
import com.github.repository.HibernateCustomerRepositoryImpl;
import com.github.service.CustomerService;
import com.github.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="customerService")
    public CustomerService getCustomerService() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        customerService.setHibernateCustomerRepository(getHibernateCustomerRepository());

        return customerService;
    }

    @Bean(name="customerRepository")
    public HibernateCustomerRepository getHibernateCustomerRepository() {
        return new HibernateCustomerRepositoryImpl();
    }
}
