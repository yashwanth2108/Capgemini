package com.example.question_1.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class AuthenticationConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user")
                .password("user123")
                .roles("User")
                .and()
                .withUser("admin")
                .password("admin123")
                .roles("Admin");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/admin","/local","/user").hasRole("Admin")
                .antMatchers("/user","/local").hasRole("User")
                .antMatchers("").permitAll()
                .and()
                .formLogin();
    }

    @Bean
    public PasswordEncoder getPassword()
    {
        return NoOpPasswordEncoder.getInstance();
    }

}
