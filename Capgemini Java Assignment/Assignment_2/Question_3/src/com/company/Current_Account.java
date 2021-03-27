package com.company;

public class Current_Account extends Bank{
    private double cashCredit;
    private double previousBalance;

    public Current_Account(int accountNumber, String accountholder, String accountType, double balance) {
        super(accountNumber, accountholder, accountType, balance);
        this.previousBalance = balance;
    }

    public double getCashCredit() {
        return cashCredit;
    }

    public double getPreviousBalance() {
        return previousBalance;
    }

    public void setPreviousBalance(double previousBalance) {
        this.previousBalance = previousBalance;
    }

    public void setCashCredit() {
        this.cashCredit = this.previousBalance - super.getBalance();
        this.previousBalance = super.getBalance();
    }

    public void updateBalance(float interest)
    {
        super.setBalance( super.getBalance() - super.getBalance()*(interest/100) );
    }
    public void updateBalance(double addMoney)
    {
        this.cashCredit = addMoney;
        this.previousBalance = super.getBalance();
        super.setBalance( super.getBalance() + addMoney );
    }

    @Override
    public String toString() {
        return "Bank { \n" +
                "accountNumber= " + super.getAccountNumber() +
                ", \n accountholder= ' " + super.getAccountholder() + '\'' +
                ", \n accountType= ' " + super.getAccountType() + '\'' +
                ", \n balance= " + super.getBalance() + " \n Current_Account {" +
                "\n cashCredit=" + cashCredit +
                ", \npreviousBalance=" + previousBalance +
                '}';
    }
}
