package com.example.question_3;

public interface BankAccountRepository {
    public double getBalance(long accountId);
    public double updateBalance(long accountId,double newBalance);

}