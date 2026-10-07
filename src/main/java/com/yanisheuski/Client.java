package com.yanisheuski;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Client {

    @ManyToOne(cascade = CascadeType.ALL)
    private List<BankAccount> bankAccount;

    private String name;
    private String lastName;
    private String email;
    private String password;
    private boolean isBlocked;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public void addBankAccount(BankAccount bankAccount) {
        this.bankAccount.add(bankAccount);
    }

    public void removeBankAccount(BankAccount bankAccount) {
        this.bankAccount.remove(bankAccount);
    }
}
