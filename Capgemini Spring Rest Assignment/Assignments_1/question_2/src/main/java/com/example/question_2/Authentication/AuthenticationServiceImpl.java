package com.example.question_2.Authentication;

import com.example.question_2.User.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AuthenticationServiceImpl implements AuthenticationService{

    Map<String,String> authenticationList = null;

    LoginCredentials loginCredentials = new LoginCredentials();

    public String CheckAuthentication(User user)
    {
        authenticationList = loginCredentials.getAuthenticationList();
        if(authenticationList!=null)
        {
            if(authenticationList.containsKey(user.getUserName()))
            {
                return authenticationList.get(user.getUserName()).equals(user.getUserPassword()) ? "Valid user" : "Invalid user";
            }
        }
        return "Invalid user";
    }
}
