package com.example.question_9.Service;

import com.example.question_9.Model.Customer;
import com.example.question_9.Repository.CustomerServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl {


    @Autowired
    CustomerServiceRepository customerServiceRepository;


    public void addCustomer(Customer customer) {
        customerServiceRepository.save(customer);
    }

    public Optional<Customer> searchCustomer(Integer custId) {

        return customerServiceRepository.findById(custId);
    }

    public void deleteCustomer(Integer custId) {
        customerServiceRepository.deleteById(custId);
    }

    public Iterable<Customer> findAllCustomer() {

        return customerServiceRepository.findAll();
    }
    public void updateCustomer(Customer customer) {
        customerServiceRepository.save(customer);
    }

}
