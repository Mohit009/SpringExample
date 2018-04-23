package com.github.repository;

import com.github.model.Customer;

import java.util.List;

public interface HibernateCustomerRepository {
    List<Customer> findAll();
}
