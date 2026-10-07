package com.yanisheuski.dto;

import com.yanisheuski.BankAccount;
import lombok.*;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResponseClientDTO {
    private String jwtToken;
    private String email;
    private String name;
    private String lastname;
    private List<BankAccount> bankAccounts;
}

