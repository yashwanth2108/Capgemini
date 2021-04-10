package com.example.question_2.Authentication;

import com.example.question_2.User.User;
import org.springframework.stereotype.Service;

@Service
public interface AuthenticationService {
    public String CheckAuthentication(String user , String password);
}
