package com.example.question_1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "")
public class AuthenticationController {


    @GetMapping(path = "")
    public String getData()
    {
        return "Hello World!";
    }

    @GetMapping(path = "/user")
    public String getDataByUser()
    {
        return "User accessed this data :   'Secret Code : Hello World!' ";
    }

    @GetMapping(path = "/local")
    public String getLocalData()
    {
        return "Local data :   'Secret Code : Hello World!' ";
    }

    @GetMapping(path = "/admin")
    public String getDataByAdmin()
    {
        return "Admin accessed this data :   'Secret Code : Hello World!' ";
    }
}
