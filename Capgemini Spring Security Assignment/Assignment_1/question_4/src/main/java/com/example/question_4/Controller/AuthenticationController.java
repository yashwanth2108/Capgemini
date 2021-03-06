package com.example.question_4.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/")
public class AuthenticationController {

    @GetMapping(path = "wrong")
    public String getWorld()
    {
        return "error";
    }

    @GetMapping(path = "")
    public String login()
    {
        return "login";
    }

    @GetMapping(path = "/home")
    public String getData() { return "home"; }

    @GetMapping(path = "/user")
    public String getUser()
    {
        return "home";
    }

    @GetMapping(path = "/admin")
    public String getAdmin()
    {
        return "home";
    }


    @GetMapping(path = "/error")
    public String getError()
    {
        return ("<h1>Wrong UserName and Password</h1>");
    }

}
