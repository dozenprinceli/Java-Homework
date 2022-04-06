package pers.dozenlee.exp.exp2.exp2_3;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Random random = new Random();
    int times = 10000;

    @Test
    void deposit() {
        for (int i = 0; i < times; i++) {
            Account account = new Account(random.nextLong());
            long money = random.nextLong();
            BigDecimal depositMoney = BigDecimal.valueOf(money);
            if (money <= 0) {
                // 测试存款数目为非正数
                assertThrows(IllegalArgumentException.class, () -> {
                    account.deposit(depositMoney);
                });
            } else {
                // 测试正常存款
                assertTrue(account.deposit(depositMoney));
            }
        }
    }

    @Test
    void withdraw() {
        for (int i = 0; i < times; i++) {
            Account account = new Account(random.nextLong());
            long money = random.nextLong();
            BigDecimal withdrawMoney = BigDecimal.valueOf(money);
            account.deposit(BigDecimal.valueOf(random.nextLong() >>> 1));
            if (money <= 0) {
                // 测试取款数目为非正数
                assertThrows(IllegalArgumentException.class, () -> {
                    account.withdraw(withdrawMoney);
                });
            } else {
                if (withdrawMoney.compareTo(account.balanceCheck()) > 0) {
                    // 测试取款失败
                    assertFalse(account.withdraw(withdrawMoney));
                } else {
                    // 测试正常取款
                    assertTrue(account.withdraw(withdrawMoney));
                }
            }
        }
    }
}