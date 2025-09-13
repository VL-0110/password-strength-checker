package com.example.passwordchecker;

import org.springframework.web.bind.annotation.*;
import java.util.regex.*;

@RestController
@RequestMapping("/api")
public class PasswordStrengthController {

    @PostMapping("/checkPassword")
    public PasswordResponse checkPassword(@RequestBody PasswordRequest request) {
        String password = request.getPassword();
        int score = 0;

        // Rules
        if (password.length() >= 8) score++;
        if (Pattern.compile("[A-Z]").matcher(password).find()) score++;
        if (Pattern.compile("[a-z]").matcher(password).find()) score++;
        if (Pattern.compile("[0-9]").matcher(password).find()) score++;
        if (Pattern.compile("[@#$%^&+=!]").matcher(password).find()) score++;

        // Strength evaluation
        String strength;
        if (score <= 2) {
            strength = "Weak";
        } else if (score <= 4) {
            strength = "Medium";
        } else {
            strength = "Strong";
        }

        return new PasswordResponse(strength, score);
    }
}

