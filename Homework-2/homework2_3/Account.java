package homework2_3;

/**
 * 账户类。可存款、取款、查询余额
 */
public class Account {
    private long account;
    private double balance;

    /**
     * 用账号初始化一个账户,默认余额为0
     * @param account 账号
     */
    public Account(long account) {
        this.account = account;
    }
    
    /**
     * 存款
     * @param money 存款的金额
     * @throws IllegalArgumentException("DepositRangeException") 若存款金额为负数
     */
    public void deposit(double money) {
        // Exception handling
        if(money <= 0) throw new IllegalArgumentException("DepositRangeException");
        else balance += money;
    }

    /**
     * 取款
     * 
     * @param money 取款的金额
     * @throws IllegalArgumentException("InsuffientAccountBalanceException") 若取款金额大于余额
     * @throws IllegalArgumentException("WithdrawRangeException") 若取款金额为负数
     */
    public void withdraw(double money) {
        // Exception handling
        if(money > balance) throw new IllegalArgumentException("InsuffientAccountBalanceException");
        else if(money <= 0) throw new IllegalArgumentException("WithdrawRangeException");
        else balance -= money;
    }

    /**
     * 查询余额
     * @return 账户余额，并输出一个显示余额的语句
     */
    public double BalanceCheck() {
        System.out.println("Your balance is: " + balance);
        return balance;
    }

    /**
     * 获取账号
     * @return 账号
     */
    public long getAccount() {
        return account;
    }
}