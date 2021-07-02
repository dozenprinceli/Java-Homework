/**
 * 在屏幕上输出1！+2！+3！+……+10！的和
 */
public class homework1_2 {
    
    /**
     * 计算n的阶乘
     * 
     * @param n 阶乘的底数
     * @return n的阶乘的值
     * @throws IllegalArgumentException("InputNumberRangeException") 如果n为负数
     */
    private int factorial(int n) {
        if (n < 0) throw (new IllegalArgumentException("InputNumberRangeException"));
        else return n <= 1 ? 1 : factorial(n - 1) * n;
    }

    /**
     * 计算1!到n!之和，即1!+2!+...+n!
     * 
     * @param n 阶乘和的上限索引
     * @return 1!到n!的和
     * @throws IllegalArgumentException("InputNumberRangeException") 如果n为负数
     */
    private int SumOfFac(int n) {
        if (n <= 0) throw (new IllegalArgumentException("InputNumberRangeException"));
        else return n == 1 ? 1 : SumOfFac(n - 1) + factorial(n);
    }

    public static void main(String[] args) {
        System.out.println("从1!加到10!的和为 " + new homework1_2().SumOfFac(10));
    }
    
}