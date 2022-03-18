package cn.edu.cumtb.Exp1;

/**
 * 1_2异常接口
 */
interface Exp1_2Exception {
    IllegalArgumentException NEGATIVE_ARGUMENT_EXCEPTION =
            new IllegalArgumentException("Negative Argument Exception!");

    IllegalArgumentException NON_POSITIVE_ARGUMENT_EXCEPTION =
            new IllegalArgumentException("Non-positive Argument Exception!");
}

/**
 * 编写一个Java程序在屏幕上输出1!+2!+3!+...+10!的和
 */
public class Exp1_2 {
    public static void main(String[] args) {
        System.out.println("1!+2!+...+10! = " + Exp1_2Util.sumOfFac(10));
    }
}

/**
 * 1_2工具类
 */
class Exp1_2Util implements Exp1_2Exception {
    /**
     * 计算给定底数的阶乘
     *
     * @param n 阶乘的底数
     * @return n!，即n的阶乘
     * @throws IllegalArgumentException NEGATIVE_ARGUMENT_EXCEPTION 输入参数为负数
     */
    private static int factorial(int n) {
        if (n < 0) {
            throw NEGATIVE_ARGUMENT_EXCEPTION;
        } else {
            return n <= 1 ? 1 : factorial(n - 1) * n;
        }
    }

    /**
     * 计算从1到n的阶乘之和
     *
     * @param n 计算的最大阶乘
     * @return 阶乘和
     * @throws IllegalArgumentException NON_POSITIVE_ARGUMENT_EXCEPTION 输入参数为非正数
     */
    public static int sumOfFac(int n) {
        if (n <= 0) {
            throw NON_POSITIVE_ARGUMENT_EXCEPTION;
        } else {
            return n == 1 ? 1 : sumOfFac(n - 1) + factorial(n);
        }
    }
}