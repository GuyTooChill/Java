import java.util.ArrayList;

public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount(){
        this.checkingBalance = 0.0;
        this.savingsBalance = 0.0;
        this.totalMoney = this.checkingBalance + this.savingsBalance;
        accounts++;
    }

    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance){
        this.checkingBalance += checkingBalance;
    }

    public double getSavingsbalance(){
        return this.savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance){
        this.savingsBalance += savingsBalance;
    }

    public static int getAccounts(){
        return this.accounts;
    }

    public static double getTotalMoney(){
        return this.totalMoney;
    }


    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    // getBalance
    // - display total balance for checking and savings of a particular bank account

    public void displayAccount(){
        System.out.println("Current Checking Balance: " + this.checkingBalance);
        System.out.println("Current Savings Balance: " + this.savingsBalance);
    }

    public void checkingsDeposit(int amount){
        this.setCheckingBalance += amount;
        this.setTotalMoney;
    }

    public void checkingsWithdraw(int amount){
        this.setSavingsBalance -= amount;
        this.setTotalMoney;
    }

    public void savingsDeposit(int amount){
        this.setSavingsBalance += amount;
        this.setTotalMoney;
    }


    public void savingsWithdraw(int amount){
        this.setSavingsBalance -= amount;
        this.setTotalMoney;
    }

}
