package com.example.passwordchecker;

public class PasswordResponse {
    private String strength;
    private int score;

    // Constructor
    public PasswordResponse(String strength, int score) {
        this.strength = strength;
        this.score = score;
    }

    // Getters
    public String getStrength() {
        return strength;
    }
    public int getScore() {
        return score;
    }
}

