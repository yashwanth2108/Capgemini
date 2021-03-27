package com.company;

public class Bank {
    private int accountNumber;
    private String accountholder;
    private String accountType;
    private double balance;

    public Bank(int accountNumber, String accountholder, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountholder = accountholder;
        this.accountType = accountType;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountholder() {
        return accountholder;
    }

    public void setAccountholder(String accountholder) {
        this.accountholder = accountholder;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void updateBalance(float interest)
    {
        this.balance = this.balance - this.balance*interest/100;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accountNumber= " + accountNumber +
                ", accountholder= ' " + accountholder + '\'' +
                ", accountType= ' " + accountType + '\'' +
                ", balance= " + balance +
                '}';
    }
}
