package com.github.service;

import com.github.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
