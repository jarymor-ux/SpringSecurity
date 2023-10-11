package com.ostap.SpringSecurity.Configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        User.UserBuilder userBuilder = User.withDefaultPasswordEncoder();

        auth.inMemoryAuthentication()
                .withUser(userBuilder.username("Ostap").password("123123").roles("EMPLOYEE"))
                .withUser(userBuilder.username("Eva").password("321321").roles("MANAGER"))
                .withUser(userBuilder.username("Ivan").password("123321").roles("MANAGER", "EMPLOYEE"));
    }
}
