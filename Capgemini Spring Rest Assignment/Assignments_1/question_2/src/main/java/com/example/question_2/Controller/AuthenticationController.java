package com.example.question_2.Controller;

import com.example.question_2.Authentication.AuthenticationService;
import com.example.question_2.Authentication.AuthenticationServiceImpl;
import com.example.question_2.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    User user = new User();

    private AuthenticationService authenticationService = new AuthenticationServiceImpl();

    @GetMapping(path = "/user")
    public User userDetail()
    {
        System.out.println(user);
        return this.user;
    }

    @GetMapping(path = "/authentication/{user}:{password}")
    public String authenticateUser(@PathVariable String user , @PathVariable String password)
    {
        return authenticationService.CheckAuthentication(user,password);
    }
}
