package oct012024;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BankingApp {

    private String accountType;
    private String accountHolderName;
    private String accountNumber;
    private double currentBalance;

    //If we have a parameterized constructor in a class,
    //and no default constructor is there, then we have to pass the arguments during the run time
    public BankingApp(String accountHolderName,String accountNumber, double currentBalance)
    {
        this(); //this keyword is used to call the default constructor and it should be first line in the constructor
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.currentBalance=currentBalance;
    }

    private BankingApp()
    {
        accountType="Savings";
    }

    //POJO class: Plain Old Java Object
    //Setters and getters are used to set and get the values of the private variables

//    public String getAccountHolderName() {
//        return accountHolderName;
//    }
//
//    public void setAccountHolderName(String accountHolderName) {
//        this.accountHolderName = accountHolderName;
//    }


    public BankingApp depositAmount(double amount)
    {
        currentBalance=currentBalance+amount;
        return this; //this keyword is used to return the current object
    }

    public BankingApp withdrawAmount(double amount)
    {
        currentBalance=currentBalance-amount;
        return this;
    }

    public BankingApp displayBalance()
    {
        System.out.println("The current balance is: "+currentBalance);
        return this;
    }

    public BankingApp addInterestToTheBalance()
    {
        currentBalance=currentBalance+(currentBalance*0.07);
        return this;
    }
}