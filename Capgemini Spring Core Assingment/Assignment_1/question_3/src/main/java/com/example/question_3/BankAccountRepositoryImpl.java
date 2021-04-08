package com.example.question_3;

import java.util.HashMap;
import java.util.Map;

public class BankAccountRepositoryImpl implements BankAccountRepository{

    Map<Long,BankAccount> bankAccountMap = new HashMap<Long, BankAccount>();


    @Override
    public double getBalance(long accountId) {
        if(bankAccountMap.containsKey(accountId))
            return bankAccountMap.get(accountId).getAccountBalance();
        System.out.println("There is no Account Id Exist");
        return -1;
    }

    @Override
    public double updateBalance(long accountId, double newBalance) {
        if(bankAccountMap.containsKey(accountId))
        {
            bankAccountMap.get(accountId).setAccountBalance(newBalance);
            return newBalance;
        }
        System.out.println("There is no Account Id Exist");
        return -1;
    }


    public void setRepository(Map<Long,BankAccount> repository) {
        this.bankAccountMap = repository;
    }
}
