package com.example.question_3;

public class BankAccountController  {

    BankAccountRepositoryImpl bankAccountRepository = null;

    public double withdraw(long accountId, double balance) {
        return 0;
    }

    public double deposit(long accountId, double balance) {
        return 0;
    }

    public double getBalance(long accountId) {
        return 0;
    }

    public boolean fundTranster(long fromAccount, long toAccount, double amount) {
        return false;
    }

    public void setInitializeRepositories(BankAccountRepositoryImpl initializeRepositories) {
        this.bankAccountRepository=initializeRepositories;
    }
}
