package com.driver;

public class SavingsAccount extends BankAccount {
    double rate;
    double maxWithdrawalLimit;
    double minimumBalance = 0;

    public SavingsAccount(String name, double balance, double maxWithdrawalLimit, double rate) {
        // minimum balance is 0 by default
        super(name, balance);
        this.maxWithdrawalLimit = maxWithdrawalLimit;
        this.rate = rate;

    }

    public void withdraw(double amount) throws Exception {
        // Might throw the following errors:
        // 1. "Maximum Withdraw Limit Exceed" : If the amount exceeds maximum withdrawal limit
        // 2. "Insufficient Balance" : If the amount exceeds balance
        if (maxWithdrawalLimit < amount) {
            throw new Exception("Maximum Withdraw Limit Exceed");

        } else if (amount > super.getBalance()) {
            throw new Exception("Insufficient Balance");

        } else {
            super.setBalance(super.getBalance() - amount);
        }

    }

    public double getSimpleInterest(int years) {
        // Return the final amount considering that bank gives simple interest on current amount


        // Calculate simple interest
        return (double)((double)super.getBalance() * (double)years * (double)this.rate) / 100;

    }

    public double getCompoundInterest(int times, int years) {
        // Return the final amount considering that bank gives compound interest on current amount given times per year
        return  (double)super.getBalance() * (double)(Math.pow((double)(1 + (double)this.rate / 100),(double) years));
    }

}