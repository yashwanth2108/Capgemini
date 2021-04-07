package com.example.question_3;

public class BankAccountController  {

    BankAccountRepositoryImpl bankAccountRepository = null;

    public double withdraw(long accountId, double balance) {
        if(bankAccountRepository!=null)
        {

            if(bankAccountRepository.bankAccountMap.containsKey(accountId))
            {
                if(bankAccountRepository.bankAccountMap.get(accountId).getAccountBalance() >= balance)
                {
                    bankAccountRepository.updateBalance(accountId,bankAccountRepository.getBalance(accountId)-balance);
                    return balance;
                }
                System.out.println("Account Balance is Inefficient");
            }
            System.out.println("There is no Account ID exist");
            return -1;
        }
        return -1;
    }

    public double deposit(long accountId, double balance) {

        if(bankAccountRepository!=null)
        {

            if(bankAccountRepository.bankAccountMap.containsKey(accountId))
            {
                bankAccountRepository.updateBalance(accountId,bankAccountRepository.getBalance(accountId)+balance);
                return balance+bankAccountRepository.getBalance(accountId);
            }
            System.out.println("There is no Account ID exist");
            return -1;
        }
        return -1;
    }

    public double getBalance(long accountId) {
        if(bankAccountRepository!=null)
        {
            BankAccountIds bankAccountIds ;

            if(bankAccountRepository.bankAccountMap.containsKey(accountId))
            {
                return bankAccountRepository.getBalance(accountId);
            }
            System.out.println("There is no Account ID exist");
            return -1;
        }
        return -1;
    }

    public boolean fundTransfer(long fromAccount, long toAccount, double amount) {

        if(bankAccountRepository!=null)
        {

            if(bankAccountRepository.bankAccountMap.containsKey(fromAccount) && bankAccountRepository.bankAccountMap.containsKey(fromAccount))
            {
                if(bankAccountRepository.getBalance(fromAccount) >= amount)
                {
                    bankAccountRepository.updateBalance(fromAccount,bankAccountRepository.getBalance(fromAccount)-amount);
                    bankAccountRepository.updateBalance(toAccount,bankAccountRepository.getBalance(toAccount)+amount);
                    return false;
                }
                System.out.println("Account Balance is Inefficient");
                return false;
            }
            System.out.println("There is no Account ID exist");
            return false;
        }
        return false;
    }

    public BankAccountRepositoryImpl getBankAccountRepository() {
        return bankAccountRepository;
    }

    public void setInitializeRepositories(BankAccountRepositoryImpl initializeRepositories) {
        bankAccountRepository=initializeRepositories;
        bankAccountRepository.bankAccountMap=initializeRepositories.bankAccountMap;
    }
}
