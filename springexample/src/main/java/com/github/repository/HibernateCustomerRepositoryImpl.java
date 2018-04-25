package com.github.repository;

import com.github.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements HibernateCustomerRepository {

    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstName("Mohit");
        customer.setLastName("Arora");

        customers.add(customer);

        return customers;
    }
}
