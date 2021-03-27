package com.company;

public class Saving_Account {
    private double acc_balance;
    private int acc_id;
    private String accountHolderName;
    private Boolean isSalaryAccount;


    public Saving_Account(double acc_balance, int acc_id, String accountHolderName, Boolean isSalaryAccount) {
        this.acc_balance = acc_balance;
        this.acc_id = acc_id;
        this.accountHolderName = accountHolderName;
        this.isSalaryAccount = isSalaryAccount;
    }

    public double getAcc_balance() {
        return acc_balance;
    }

    public void setAcc_balance(double acc_balance) {
        this.acc_balance = acc_balance;
    }

    public int getAcc_id() {
        return acc_id;
    }

    public void setAcc_id(int acc_id) {
        this.acc_id = acc_id;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public Boolean getSalaryAccount() {
        return isSalaryAccount;
    }

    public void setSalaryAccount(Boolean salaryAccount) {
        isSalaryAccount = salaryAccount;
    }

    public void deposit(double addMoney)
    {
        this.acc_balance += addMoney;
    }

    public void withdraw(double needMoney)
    {
        if(this.acc_balance > needMoney)
            this.acc_balance -= needMoney;
        else
            System.out.println("Insufficient Amount in your balance");
    }

    @Override
    public String toString() {
        return "Saving_Account{" +
                "acc_balance=" + acc_balance +
                ", acc_id=" + acc_id +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", isSalaryAccount=" + isSalaryAccount +
                '}';
    }
}
