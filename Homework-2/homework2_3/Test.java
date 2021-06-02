package homework2_3;

public class Test {
    public static void main(String[] args) {
        Account account_1234 = new Account(1234);
        System.out.println("The initial balance is:");
        account_1234.BalanceCheck();
        account_1234.deposit(20122.8);
        System.out.println("After a deposit, the balance is:");
        account_1234.BalanceCheck();
        account_1234.withdraw(10122.3);
        System.out.println("After a withdraw, the balance is:");
        account_1234.BalanceCheck();
    }
}