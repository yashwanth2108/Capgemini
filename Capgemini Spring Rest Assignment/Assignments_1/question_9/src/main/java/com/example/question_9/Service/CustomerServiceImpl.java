package com.example.question_9.Service;

import com.example.question_9.Model.Customer;
import com.example.question_9.Repository.CutomerServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CustomerServiceImpl {


    @Autowired
    CutomerServiceRepository cutomerServiceRepository;

    public void addCustomer(Customer customer) {
        cutomerServiceRepository.save(customer);
    }

    public Optional<Customer> searchCustomer(Integer custId) {

        return cutomerServiceRepository.findById(custId);
    }

    public void deleteCustomer(Integer custId) {
        cutomerServiceRepository.deleteById(custId);
    }

    public Iterable<Customer> findAllCustomer() {

        return cutomerServiceRepository.findAll();
    }
    public void updateCustomer(Customer customer) {
        cutomerServiceRepository.save(customer);
    }

}
