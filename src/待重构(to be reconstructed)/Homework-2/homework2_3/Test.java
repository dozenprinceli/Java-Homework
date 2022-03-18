package homework2_3;

/**
 * 测试类Test，用于测试Account类
 */
public class Test {
    public static void main(String[] args) {
        Account account_1234 = new Account(1234);
        
        System.out.println("The initial balance is:");
        account_1234.BalanceCheck();
        
        account_1234.deposit(20122.8);
        System.out.println("After a deposit");
        account_1234.BalanceCheck();
        
        account_1234.withdraw(10122.3);
        System.out.println("After a withdraw");
        account_1234.BalanceCheck();

        // 测试余额不足的取款
        try{
            account_1234.withdraw(200000);
        }
        catch(IllegalArgumentException e) {
            System.out.print("余额不足取款失败测试: ");
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }
}