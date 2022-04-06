package pers.dozenlee.exp.exp3.exp3_6;

/**
 * @author DozenPrince Li
 * @date 2022/3/25
 */
public class ClassA implements InterfaceA{
    /**
     * 计算1到n的和
     * @param n 求和的上限
     * @return 计算后的和
     */
    @Override
    public int method(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("The argument n should be greater than 0!");
        }

        return n == 1 ? 1 : method(n - 1) + n;
    }
}
