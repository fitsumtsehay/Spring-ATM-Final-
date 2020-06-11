package com.example.demo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long accountID;
    private String accountName;
    private String accountType;
    private Double balance;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Transaction> Transactions ;


    public Account() {
    }

    public Account(String accountName, String accountType, Double balance, User user, List<Transaction> transactions) {
        this.accountName = accountName;
        this.accountType = accountType;
        this.balance = balance;
        this.user = user;
        Transactions = transactions;
    }

    public long getId() {
        return accountID;
    }

    public void setId(long id) {
        this.accountID = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Transaction> getTransactions() {
        return Transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        Transactions = transactions;
    }
}

