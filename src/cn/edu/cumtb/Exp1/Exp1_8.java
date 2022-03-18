package cn.edu.cumtb.Exp1;

import java.util.Random;

/**
 * 1_8异常接口
 */
interface Exp1_8Exception {
    IllegalArgumentException ARGUMENT_OUT_OF_RANGE_EXCEPTION =
            new IllegalArgumentException("Input PlainInt Should Be 1000~9999!");
}

/**
 * 某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：
 * 每位数字都加上5,然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换
 */
public class Exp1_8 {
    public static void main(String[] args) {
        int testTime = 20;
        for (int i = 0; i < testTime; i++) {
            int testInt = Exp1_8Util.gen4DigitInt();
            System.out.println("The Plaintext Integer Is: " + testInt);
            System.out.println("The Encoded Integer Is: " + Exp1_8Util.encode(testInt) +
                    "\n");
        }
    }
}

/**
 * 1_8工具类
 */
class Exp1_8Util implements Exp1_8Exception{
    /**
     * 根据题目要求对一个四位整数进行加密
     *
     * @param plainInt 加密前的明文整数，范围[1000, 9999]
     * @return 加密后的整数
     */
    public static int encode(int plainInt) {
        if (plainInt < 1000 || plainInt > 9999) {
            throw ARGUMENT_OUT_OF_RANGE_EXCEPTION;
        }

        Integer[] encodeArr = new Integer[4];
        for (int i = 0; i < encodeArr.length; i++) {
            encodeArr[i] = plainInt % 10;
            encodeArr[i] = (encodeArr[i] + 5) % 10;
            plainInt /= 10;
        }

        Exp1_7Util.swap(encodeArr, 0, 3);
        Exp1_7Util.swap(encodeArr, 1, 2);

        int encode = 0;
        for (int i = 0; i < encodeArr.length; i++) {
            encode += encodeArr[i] * (int)(Math.pow(10, i));
        }

        return encode;
    }

    public static int gen4DigitInt() {
        Random random = new Random();
        return random.nextInt(9000) + 1000;
    }
}
