package com.example.question_6.Service;


import com.example.question_6.DTO.CustomerDTO;
import com.example.question_6.Model.Customer;
import com.example.question_6.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public Customer saveCustomer(final CustomerDTO customerData) {
        Customer customerModel = populateCustomerData(customerData);
        return customerRepository.save(customerModel);
    }

    private Customer populateCustomerData(final CustomerDTO customerData) {
        Customer customer = new Customer();
        customer.setUsername(customerData.getUsername());
        customer.setPassword(passwordEncoder.encode(customerData.getPassword()));

        return customer;
    }
}