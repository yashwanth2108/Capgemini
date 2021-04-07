package com.example.question_3;

public interface BankAccountService {
    public double withdraw(long accountId,double balance);
    public double deposit(long accountId,double balance);
    public double getBalance(long accountId);
    public boolean fundTranster(long fromAccount,long toAccount,double amount);
}
