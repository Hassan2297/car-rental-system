package com.example.carerentalsystem.enums;

/**
 * @author Hassan Wael
 */
public enum  TransactionType {

    BUY("BUY"),
    RENT("RENT"),
    SELL("SELL");

    private String transactionType;

    TransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
}
