package com.example.question_5.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/")
public class AuthenticationController {

    @GetMapping(path = "login")
    public String login()
    {
        return "login";
    }

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

    @GetMapping(path = "")
    public String getLogout()
    {
        return "login";
    }

    @GetMapping(path = "/error")
    public String getError()
    {
        return ("<h1>Wrong UserName and Password</h1>");
    }


}
