package cn.edu.cumtb.Exp1;

import java.util.Arrays;
import java.util.Random;

/**
 * 有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
 */
public class Exp1_6 {
    public static void main(String[] args) {
        int arrayLength = 15;
        Number[] testArray = Exp1_6Util.genIntArray(arrayLength);
        System.out.println("The Original Array Is:\n" + Arrays.toString(testArray) + "\n");
        int step = -46;
        testArray = Exp1_6Util.moveForward(testArray, step);
        System.out.println("After Move Forward " + step + " Step(s),");
        System.out.println("The Current Array Is:\n" + Arrays.toString(testArray));
    }
}

/**
 * 1_6工具类
 */
class Exp1_6Util {
    /**
     * 将给定数组中的每个元素向前移动指定长度(最后的若干个元素循环到数组开头)
     * @param array 给定的数组
     * @param step 指定的移动长度
     * @param <T> 给定数组的参数类型
     * @return 移动后的数组
     */
    public static <T extends Number> T[] moveForward(T[] array, int step) {
        // 等价转换为不超过数组长度的移动长度
        if (step > array.length) {
            int stepFormat = step % array.length;
            return moveForward(array, stepFormat);
        }
        if (step < 0) {
            int stepFormat = step % array.length + array.length;
            return moveForward(array, stepFormat);
        }

        T[] outputArray = Arrays.copyOf(array, array.length);
        System.arraycopy(array, 0, outputArray, step, array.length - step);
        System.arraycopy(array, array.length - step, outputArray, 0, step);

        return outputArray;
    }

    /**
     * 随机生成指定长度的元素值0~9的整型数组
     *
     * @param n 指定的数组长度
     * @return 生成的随机整型数组
     */
    public static Integer[] genIntArray(int n) {
        if (n < 0) {
            throw Exp1_5Exception.INVALID_LENGTH_ARGUMENT_EXCEPTION;
        }

        Integer[] outputArray = new Integer[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            outputArray[i] = random.nextInt(10);
        }

        return outputArray;
    }
}
