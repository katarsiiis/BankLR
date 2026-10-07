package com.yanisheuski;

import jakarta.persistence.*;

public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @OneToMany(mappedBy = "client_id", cascade = CascadeType.ALL)
    Client client;

    private double balance;

    private boolean isBlocked;
}