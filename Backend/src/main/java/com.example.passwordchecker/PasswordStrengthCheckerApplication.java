package com.example.passwordchecker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PasswordStrengthCheckerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PasswordStrengthCheckerApplication.class, args);
        System.out.println("🚀 Password Strength Checker Backend is running on http://localhost:8080");
    }
}
