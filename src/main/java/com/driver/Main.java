package com.driver;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create a CurrentAccount


        CurrentAccount currentAccount = new CurrentAccount("John Doe",10000,"ABCD");

        try {
            currentAccount.deposit(5000);
            currentAccount.withdraw(2000);
            currentAccount.validateLicenseId();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Create a SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount("Jane Doe",5000,2000, 0.05);

        try {
            savingsAccount.deposit(3000);
            savingsAccount.withdraw(1000);
            double simpleInterest = savingsAccount.getSimpleInterest(5);
            double compoundInterest = savingsAccount.getCompoundInterest(4, 5);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Create a StudentAccount
        StudentAccount studentAccount = new StudentAccount("Student",1000,"XYZ University");

        try {
            studentAccount.deposit(500);
            studentAccount.withdraw(200);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
