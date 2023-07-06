public class BankTest {
    public static void main(String[] args){
    // Create 3 bank accounts
    BankAccount account1 = new BankAccount();
    BankAccount account2 = new BankAccount();
    BankAccount account3 = new BankAccount();

    account1.displayAccount();

    // Deposit Test
    // - deposit some money into each bank account's checking or savings account and display the balance each time
    // - each deposit should increase the amount of totalMoney

    account1.checkingsDeposit(5000);
    account1.savingsDeposit(5000);
    account1.displayAccount();

    // Withdrawal Test
    // - withdraw some money from each bank account's checking or savings account and display the remaining balance
    // - each withdrawal should decrease the amount of totalMoney

    account1.checkingsWithdraw(3000);
    account1.savingsWithdraw(1000);
    account1.displayAccount();

    // Static Test (print the number of bank accounts and the totalMoney)

    System.out.println(BankAccount.getAccounts());

    }
}
