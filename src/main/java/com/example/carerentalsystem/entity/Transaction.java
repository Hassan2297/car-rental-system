package com.example.carerentalsystem.entity;

import com.example.carerentalsystem.enums.TransactionType;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Hassan Wael
 */
@Entity
@Table(name = Transaction.TABLE_NAME)
public class Transaction {

    static final String TABLE_NAME = "`TRANSACTION`";

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "TRANSACTION_CREATED_DATE")
    private LocalDate transactionCreatedDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "TRANSACTION_TYPE")
    private TransactionType transactionType;

    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;


    public Transaction() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getTransactionCreatedDate() {
        return transactionCreatedDate;
    }

    public void setTransactionCreatedDate(LocalDate transactionCreatedDate) {
        this.transactionCreatedDate = transactionCreatedDate;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", transactionCreatedDate=" + transactionCreatedDate +
                ", transactionType=" + transactionType +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
