package com.driver;

public class BankAccount {

    private String name;
    private double balance;
    private double minBalance;
    public BankAccount(String name, double balance, double minBalance) {

        this.name=name;
        this.balance=balance;
        this.minBalance=minBalance;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }



    public BankAccount(String name, double balance) {
        this.name=name;
        this.balance=balance;
    }

    public String generateAccountNumber(int digits, int sum) throws Exception{
        //Each digit of an account number can lie between 0 and 9 (both inclusive)
        //Generate account number having given number of 'digits' such that the sum of digits is equal to 'sum'
        //If it is not possible, throw "Account Number can not be generated" exception

        String s="";
        if(method(digits,sum,s,"")) return s;

        return "Account Number can not be generated";
    }

    public boolean method(int digits, int sum, String s,String path) {

        if(sum==0 && digits==0){
            s=path;
            return true;
        }
        if(digits<0 || sum<0) return false;

        for(int i=0;i<=9;i++){
          return   method(digits-1,sum-i,s,path+i) ||   method(digits,sum,s,path);

        }
        return false;

    }

    public void deposit(double amount) {
        //add amount to balance
        this.balance+=amount;

    }

    public void withdraw(double amount) throws Exception {
        // Remember to throw "Insufficient Balance" exception, if the remaining amount would be less than minimum balance
        if(this.balance-this.minBalance>=amount){
            this.balance-=amount;
        }
        else {
            throw new Exception("Insufficient Balance");
        }
    }

}