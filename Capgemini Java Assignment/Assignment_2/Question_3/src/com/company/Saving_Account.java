package com.company;

public class Saving_Account extends Bank {

    private double fixedDeposit = 10000;

    public Saving_Account(int accountNumber, String accountholder, String accountType, double balance, double fixedDeposit) {
        super(accountNumber, accountholder, accountType, balance);
        this.fixedDeposit = fixedDeposit;
    }

    public double getFixedDeposit() {
        return fixedDeposit;
    }

    public void setFixedDeposit(int fixedDeposit) {
        this.fixedDeposit = fixedDeposit;
    }

    public void updateBalance(float interest)
    {
        super.setBalance( super.getBalance() - super.getBalance()*interest/100 );
    }
    public void updateBalance(double addMoney)
    {
        if(addMoney <= fixedDeposit)
            super.setBalance( super.getBalance() + addMoney );
        else
            System.out.println("You are not allowed to add that much money");
    }

    @Override
    public String toString() {
        return "Bank { \n" +
                "accountNumber= " + super.getAccountNumber() +
                ", \n accountholder= ' " + super.getAccountholder() + '\'' +
                ", \n accountType= ' " + super.getAccountType() + '\'' +
                ", \n balance= " + super.getBalance() + " \n Saving_Account{" +
                " \n fixedDeposit=" + fixedDeposit +
                '}';
    }
}
