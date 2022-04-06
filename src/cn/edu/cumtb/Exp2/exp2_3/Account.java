package pers.dozenlee.exp.exp2.exp2_3;

import java.math.BigDecimal;

/**
 * 账户操作异常接口
 */
interface AccountOperationException {
    IllegalArgumentException DEPOSIT_MONEY_RANGE_EXCEPTION =
            new IllegalArgumentException("Deposit money should be positive!");

    IllegalArgumentException WITHDRAW_MONEY_RANGE_EXCEPTION =
            new IllegalArgumentException("Withdraw money should be positive!");
}

/**
 * 账户类
 */
public class Account implements AccountOperationException {
    @SuppressWarnings("FieldCanBeLocal")
    private final long accountNumber;
    private BigDecimal balance;

    /**
     * 通过账号新建一个账户，存款默认为0
     * @param accountNumber 账号
     */
    public Account(long accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = BigDecimal.ZERO;
    }

    /**
     * 存款
     * @param money 存款数目
     * @return true 成功，false 失败
     * @throws IllegalArgumentException DEPOSIT_MONEY_RANGE_EXCEPTION 存款数目为负数
     */
    public boolean deposit(BigDecimal money) {
        if (money.compareTo(BigDecimal.ZERO) <= 0) {
            throw DEPOSIT_MONEY_RANGE_EXCEPTION;
        }

        balance = balance.add(money);
        return true;
    }

    /**
     * 取款
     * @param money 取款数目
     * @return true 成功，false 失败
     * @throws IllegalArgumentException WITHDRAW_MONEY_RANGE_EXCEPTION 取款数目为负数
     */
    public boolean withdraw(BigDecimal money) {
        if (money.compareTo(BigDecimal.ZERO) <= 0) {
            throw WITHDRAW_MONEY_RANGE_EXCEPTION;
        }
        if (money.compareTo(balance) > 0) {
            System.out.println("余额不足，存款失败");
            return false;
        }

        balance = balance.subtract(money);
        return true;
    }

    /**
     * 余额查询
     * @return 余额数目
     */
    public BigDecimal balanceCheck() {
        return balance;
    }
}
