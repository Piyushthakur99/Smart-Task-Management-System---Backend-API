package com.example.taskmanager.dto;

import lombok.Data;

@Data
public class AuthRequest {
    private String username;
    private String password;
    private String role; // Optional: Only used for registration
}