package com.example.question_3;

import java.util.HashMap;
import java.util.Map;

public class BankAccountRepositoryImpl implements BankAccountRepository{

    Map<Long,BankAccount> bankAccountMap = new HashMap<Long, BankAccount>();


    @Override
    public double getBalance(long accountId) {
        return 0;
    }

    @Override
    public double updateBalance(long accountId, double newBalance) {
        return 0;
    }
}
