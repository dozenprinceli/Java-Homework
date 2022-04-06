package pers.dozenlee.exp.exp3.exp3_6;

/**
 * @author DozenPrince Li
 * @date 2022/3/25
 */
public class ClassB implements InterfaceA {
    /**
     * 计算指定参数阶乘
     * @param n 阶乘的底数
     * @return n的阶乘
     */
    @Override
    public int method(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The argument n should be non-negative!");
        }

        return n == 1 ? 1 : method(n - 1) * n;
    }
}
