package com.loginapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.loginapp.repo")
@SpringBootApplication
@EntityScan("com.loginapp.entity")
@ComponentScan({"com.loginapp.component", "com.loginapp.controller", "com.loginapp.service", "com.loginapp.config", "com.loginapp.repo"})
public class LoginappApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginappApplication.class, args);
    }

}
