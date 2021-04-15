package com.example.question_3.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@EnableWebSecurity
public class AuthenticationConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;


    // Custom Table Creation
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
                .dataSource(dataSource)
        .usersByUsernameQuery("select username,password,enabled from users  where username = ? ")
        .authoritiesByUsernameQuery("select username , authority from authorities where username = ?");
    }

    // default database
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.jdbcAuthentication()
//        .dataSource(dataSource)
//        .withDefaultSchema()
//        .withUser(
//                User.withUsername("user1")
//                .password("user1")
//                .roles("User")
//        ).withUser(
//                User.withUsername("user2")
//                        .password("user12")
//                        .roles("User")
//        ).withUser(
//                User.withUsername("user3")
//                        .password("user123")
//                        .roles("User")
//        ).withUser(
//                User.withUsername("user4")
//                        .password("user1234")
//                        .roles("User")
//        ).withUser(
//                User.withUsername("admin")
//                        .password("admin")
//                        .roles("Admin")
//        );
//    }



    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/perform_login")
                .loginProcessingUrl("/perform_login")
                .defaultSuccessUrl("/go_home")
                .failureForwardUrl("/perform_login")
                .permitAll()
                .and()
                .logout()
                .logoutUrl("/perform_logout")
                .deleteCookies("JSESSIONID").permitAll();
    }


    @Bean
    public PasswordEncoder getPassword()
    {
        return NoOpPasswordEncoder.getInstance();
    }

}
