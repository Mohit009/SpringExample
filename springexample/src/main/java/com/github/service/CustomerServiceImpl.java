package com.github.service;

import com.github.model.Customer;
import com.github.repository.HibernateCustomerRepository;
import com.github.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    public HibernateCustomerRepository getHibernateCustomerRepository() {
        return hibernateCustomerRepository;
    }

    public void setHibernateCustomerRepository(HibernateCustomerRepository hibernateCustomerRepository) {
        this.hibernateCustomerRepository = hibernateCustomerRepository;
    }

    private HibernateCustomerRepository hibernateCustomerRepository;

    @Override
    public List<Customer> findAll() {
        return hibernateCustomerRepository.findAll();
    }
}
