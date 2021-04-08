package com.example.question_3;

public class BankAccountIds {
    private Long accountId;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "BankAccountIds{" +
                "accountId=" + accountId +
                '}';
    }
}
