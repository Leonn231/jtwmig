package com.irojas.demojwt.Auth;

import com.irojas.demojwt.User.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String country;
    private Role role; // Nuevo campo para el rol
}
