public class BankTest {
    public static void main(String[] args){
    // Create 3 bank accounts
    BankAccount account1 = new BankAccount();
    BankAccount account2 = new BankAccount();
    BankAccount account3 = new BankAccount();

    account1.checkingsDeposit(1000);
    account2.checkingsDeposit(2000);
    account3.checkingsDeposit(5000);

    account1.savingsDeposit(3000);
    account2.savingsDeposit(2000);
    account3.savingsDeposit(1000);

    account3.checkingsWithdraw(500);
    account1.savingsWithdraw(1000);

    BankAccount.getAccounts();

    account1.displayAccount();
    account2.displayAccount();
    account3.displayAccount();
    // Deposit Test
    // - deposit some money into each bank account's checking or savings account and display the balance each time
    // - each deposit should increase the amount of totalMoney

    // Withdrawal Test
    // - withdraw some money from each bank account's checking or savings account and display the remaining balance
    // - each withdrawal should decrease the amount of totalMoney

    // Static Test (print the number of bank accounts and the totalMoney)

    }
}
