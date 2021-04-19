package com.example.question_4.Service.UserService;

import com.example.question_4.Model.User;
import com.example.question_4.Repository.MyUserRepository;
import com.example.question_4.Service.UserDetail.MyUserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    MyUserRepository myUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user =  myUserRepository.findByUsername(username);

        user.orElseThrow(  () -> new UsernameNotFoundException("Not Found"+username) );

        return user.map(MyUserDetail::new).get();
    }
}
