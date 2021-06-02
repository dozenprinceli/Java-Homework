package homework2_3;

public class Account {
    int account;
    double balance;

    Account(int account) {
        this.account = account;
    }
    
    void deposit(double money) {
        if(money <= 0) {
            System.out.println("Deposit Should Be Positive!");
        }
        else balance += money;
    }

    void withdraw(double money) {
        if(money > balance) {
            System.out.println("Insuffient Account Balance!");
        }
        else if(money <= 0) {
            System.out.println("Withdraw Should Be Positive!");
        }
        else balance -= money;
    }

    void BalanceCheck() {
        System.out.println("Your balance is: " + balance);
    }
}