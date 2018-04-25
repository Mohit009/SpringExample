package com.github.service;

import com.github.model.Customer;
import com.github.repository.HibernateCustomerRepository;
import com.github.repository.HibernateCustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.SingletonBeanRegistry;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    public CustomerServiceImpl(HibernateCustomerRepository repository) {
        this.hibernateCustomerRepository = repository;
    }

    private HibernateCustomerRepository hibernateCustomerRepository;

    @Override
    public List<Customer> findAll() {
        return hibernateCustomerRepository.findAll();
    }
}
