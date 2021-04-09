package com.example.question_2.Authentication;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Component
public class LoginCredentials {
    Map<String,String> authenticationList;

    public LoginCredentials() {
        this.authenticationList = new HashMap<>();
        authenticationList.put("user","user123");
        authenticationList.put("manav","manav123");
        authenticationList.put("priyam","priyam123");
        authenticationList.put("admin","admin");
    }

    public Map<String, String> getAuthenticationList() {
        return authenticationList;
    }

    public void setAuthenticationList(Map<String, String> authenticationList) {
        this.authenticationList = authenticationList;
    }
}
