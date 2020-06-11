package com.example.demo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Transaction")
public class Transaction implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long transactionID;;
    private String transactionDate;
    private String transactionType;
    private String transactionTime;
    private String transactionAmount;
    private String transactionTo;
    private String transactionFrom;

    @ManyToOne
    @JoinColumn(name="accountID")
    private Account account;

    public Transaction() {
    }

    public Transaction(String transactionDate, String transactionType, String transactionTime, String transactionAmount, String transactionTo, String transactionFrom, Account account) {
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
        this.transactionTime = transactionTime;
        this.transactionAmount = transactionAmount;
        this.transactionTo = transactionTo;
        this.transactionFrom = transactionFrom;
        this.account = account;
    }

    public long getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(long transactionID) {
        this.transactionID = transactionID;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
    }

    public String getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionTo() {
        return transactionTo;
    }

    public void setTransactionTo(String transactionTo) {
        this.transactionTo = transactionTo;
    }

    public String getTransactionFrom() {
        return transactionFrom;
    }

    public void setTransactionFrom(String transactionFrom) {
        this.transactionFrom = transactionFrom;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
