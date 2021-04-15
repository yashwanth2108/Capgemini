package com.example.question_2.Controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(path = "/")
public class AuthenticationController implements ErrorController {

    @Override
    @RequestMapping(path = "/error")
    @ResponseBody
    public String getErrorPath() {
        // TODO Auto-generated method stub
        return "No Mapping Found";
    }
    @GetMapping(path = "Error")
    public String getWorld()
    {
        return "error";
    }
    @GetMapping(path = "")
    public String login()
    {
        return "login";
    }

    @GetMapping(path = "/go_home")
    public String getData()
    {
        return "home";
    }

    @GetMapping(path = "/perform_logout")
    public String getLocalData()
    {
        return "logout";
    }

    @GetMapping(path = "/error")
    public String getError()
    {
        return "Wrong UserName and Password";
    }

}
