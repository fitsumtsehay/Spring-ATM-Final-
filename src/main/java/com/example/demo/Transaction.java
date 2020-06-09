package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name="transaction_db")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="amount")
    private String amount;




}
