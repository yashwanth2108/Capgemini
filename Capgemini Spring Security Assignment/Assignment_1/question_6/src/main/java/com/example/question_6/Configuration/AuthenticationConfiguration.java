package com.example.question_6.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

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

    /*
     .antMatchers("/admin","/local","/user").hasRole("Admin")
                .antMatchers("/user","/local").hasRole("User")
                .loginPage("/login")
                .loginProcessingUrl("/login")
                .defaultSuccessUrl("/go_home")
                .failureUrl("/perform_login?error=true")
                .and()
                .logout()
                .logoutUrl("/perform_logout")
                .deleteCookies("JSESSIONID");
     */

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/**","index","/css/*","/js/*")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/login")
                .permitAll()
                .defaultSuccessUrl("/home",true)
                .and()
                .rememberMe()
                .rememberMeParameter("remember-me")
                .tokenValiditySeconds(400)
                .and()
                .logout()
                .logoutUrl("logout")
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout","GET"))
                .clearAuthentication(true)
                .invalidateHttpSession(true)
                .deleteCookies("JSESSIONID","remember-me")
                .logoutSuccessUrl("/login")
                .permitAll()
                ;
    }


    @Bean
    public PasswordEncoder getPassword()
    {
        return NoOpPasswordEncoder.getInstance();
    }

}
