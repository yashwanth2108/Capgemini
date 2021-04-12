package com.example.question_9.Controller;

import com.example.question_9.Model.Customer;
import com.example.question_9.Service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    CustomerServiceImpl customerService;

    Customer adCustomer = new Customer(2342,"Manav Verma");

    @GetMapping(path = "/adCustomer")
    public Customer addCustomer() {
        customerService.addCustomer(adCustomer);
        return adCustomer;
    }


    @PostMapping(path = "/addCustomer")
    public void addCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
    }

    @GetMapping(path = "/searchCustomer/{custId}")
    public Optional<Customer> searchCustomer(@PathVariable Integer custId) {

        return customerService.searchCustomer(custId);
    }

    @DeleteMapping("/deleteCustomer/{custId}")
    public void deleteCustomer(@PathVariable Integer custId) {
        customerService.deleteCustomer(custId);
    }

    @GetMapping("/findAllCustomer")
    public ArrayList<Customer> findAllCustomer() {
        return (ArrayList<Customer>) customerService.findAllCustomer();
    }

    @PostMapping("/updateCustomer")
    public void updateCustomer(@RequestBody Customer Customer) {
        customerService.updateCustomer(Customer);
    }
}
