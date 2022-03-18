package cn.edu.cumtb.Exp1;

/**
 * 1_4异常接口
 */
interface Exp1_4Exception {
    IllegalArgumentException INVALID_SUM_ARGUMENT_EXCEPTION = new IllegalArgumentException(
            "Numbers To Calculate Sum Should Be Positive!");
}

/**
 * 1_4回调接口
 */
interface Exp1_4Callback {
    /**
     * 求数列通项
     *
     * @param n 数列的第n项
     * @return 第n项的值
     */
    <T extends Double> T seqFormula(int n);
}

/**
 * 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和
 */
public class Exp1_4 {
    public static void main(String[] args) {
        System.out.println("前20项和为： " + Exp1_4Util.sumOfSequence(20, new Exp1_4Test()));
    }
}

/**
 * 1_4工具类
 */
class Exp1_4Util implements Exp1_4Exception {
    /**
     * 求给定通项公式的数列前n项和
     *
     * @param n    给定求和项数
     * @param func 数列通项公式
     * @return 数列前n项和
     * @throws IllegalArgumentException INVALID_SUM_ARGUMENT_EXCEPTION 若求和项数为非正数
     */
    public static double sumOfSequence(int n, Exp1_4Callback func) {
        if (n <= 0) {
            throw INVALID_SUM_ARGUMENT_EXCEPTION;
        }

        double sum = 0.0D;
        for (int i = 0; i < n; i++) {
            sum += func.seqFormula(i + 1);
        }

        return sum;
    }

    /**
     * 用于生成Fibonacci数列第n项
     *
     * @param n 指定的第n项
     * @return Fibonacci数列的第n项
     */
    static int fibonacciSeq(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return fibonacciSeq(n - 1) + fibonacciSeq(n - 2);
    }
}

class Exp1_4Test implements Exp1_4Callback {
    /**
     * 题目指定的数列通项
     *
     * @param n 数列的第n项
     * @return 题目指定数列的第n项值
     */
    @Override
    public Double seqFormula(int n) {
        return (double) Exp1_4Util.fibonacciSeq(n + 1) / (double) Exp1_4Util.fibonacciSeq(n);
    }
}