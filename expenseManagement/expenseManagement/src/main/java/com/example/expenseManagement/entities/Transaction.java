package com.example.expenseManagement.entities;

public class Transaction {
    private String concept;
    private float amount;

    public Transaction(String concept, float amount) {
        this.concept = concept;
        this.amount = amount;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
