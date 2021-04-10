package com.example.question_3.Controller;

import com.example.question_3.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    AddressService addressService;

    @GetMapping(path = "/{zipcode}")
    public String searchByZipcode(@PathVariable Integer zipcode)
    {
        return addressService.searchZipCode(zipcode);
    }
}
