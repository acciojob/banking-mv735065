package com.driver;

public class StudentAccount extends BankAccount{

    String  institutionName;


    double minimumBalance = 0;

    public StudentAccount(String name, double balance, String  institutionName) {
        //minimum balance is 0 by default
        super(name,balance);
        this.institutionName=institutionName;



    }
    public String getInstitutionName() {
        return institutionName;
    }


}
