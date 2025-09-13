package com.example.passwordchecker.service;

import org.springframework.stereotype.Service;

@Service
public class PasswordStrengthService {

    public String checkStrength(String password) {
        if (password == null || password.isEmpty()) {
            return "Password cannot be empty!";
        }

        int score = 0;

        // Length check
        if (password.length() >= 8) score++;
        if (password.length() >= 12) score++;

        // Character variety
        if (password.matches(".*[A-Z].*")) score++;        // Uppercase
        if (password.matches(".*[a-z].*")) score++;        // Lowercase
        if (password.matches(".*\\d.*")) score++;          // Digit
        if (password.matches(".*[@$!%*?&].*")) score++;    // Special char

        // Final strength rating
        if (score <= 2) {
            return "Weak";
        } else if (score <= 4) {
            return "Medium";
        } else {
            return "Strong";
        }
    }
}
