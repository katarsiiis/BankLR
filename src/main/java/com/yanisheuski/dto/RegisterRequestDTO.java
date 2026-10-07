package com.yanisheuski.dto;

import com.yanisheuski.BankAccount;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RegisterRequestDTO {
    private String name;
    private String password;
    private String lastname;
    private String email;
}
