package cn.edu.cumtb.Exp1;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * 1_5异常接口
 */
interface Exp1_5Exception {
    IllegalArgumentException ARRAY_UNSORTED_EXCEPTION =
            new IllegalArgumentException("Array Should Be Already Sorted!");

    IllegalArgumentException INVALID_LENGTH_ARGUMENT_EXCEPTION =
            new IllegalArgumentException("Specified Length Should Be Non-negative!");

    IllegalArgumentException INVALID_BOUND_RANGE_EXCEPTION =
            new IllegalArgumentException("Specified Minimum Should Be Not Bigger Than Maximum!");
}

/**
 * 有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中
 */
public class Exp1_5 {
    public static void main(String[] args) {
        Integer[] sortedArray = Exp1_5Util.genSortedIntArray(9, -20, 30);
        System.out.println("The Original Sorted Array Is:\n" + Arrays.toString(sortedArray));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter A Integer:\n\t");

        Number[] newArray = Exp1_5Util.sortedInsert(sortedArray, scanner.nextInt());
        System.out.println("Now The Array Is:\n" + Arrays.toString(newArray));
    }
}

/**
 * 1_5工具类
 */
class Exp1_5Util implements Exp1_5Exception {
    /**
     * 判断数组是否已排序
     *
     * @param array 待判断的数组
     * @param <T>   数组类型
     * @return true 已排序，false 未排序
     */
    private static <T extends Number> boolean arraySortCheck(T[] array) {
        boolean flag = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].doubleValue() > array[i + 1].doubleValue()) {
                flag = false;
                break;
            }
        }

        return flag;
    }

    /**
     * 在已排好序的数组中的合适位置插入元素
     * @param array 待插入的已排序的数组
     * @param elem 插入的数
     * @param <T1> 数组类型
     * @param <T2> 插入的数的类型
     * @return 插入后的数组
     */
    public static <T1 extends Number, T2 extends Number> T1[] sortedInsert(T1[] array,
                                                                           T2 elem) {
        if (!arraySortCheck(array)) {
            throw ARRAY_UNSORTED_EXCEPTION;
        }

        T1[] outputArray = Arrays.copyOf(array, array.length + 1);
        for (int i = 0; i < array.length; i++) {
            if (elem.doubleValue() >= array[i].doubleValue()) {
                System.arraycopy(array, 0, outputArray, 0, i + 1);
                outputArray[i + 1] = (T1) elem;
                System.arraycopy(array, i + 1, outputArray, i + 2, outputArray.length - i - 2);
            }
        }

        return outputArray;
    }

    /**
     * 提供一个限定项数、最大、最小值、随机数生成种子的排好序的整型数组
     *
     * @param n    数组长度
     * @param min  数组元素最小可能值
     * @param max  数组元素最大可能值
     * @param seed 用于随机数生成器的种子
     * @return 排好序的随机数组
     * @throws IllegalArgumentException INVALID_LENGTH_ARGUMENT_EXCEPTION 若指定数组长度为负数
     * @throws IllegalArgumentException INVALID_BOUND_RANGE_EXCEPTION 若指定最小值大于最大值
     */
    public static Integer[] genSortedIntArray(int n, int min, int max, long seed) {
        if (n < 0) {
            throw INVALID_LENGTH_ARGUMENT_EXCEPTION;
        }
        if (min > max) {
            throw INVALID_BOUND_RANGE_EXCEPTION;
        }

        Random random = new Random(seed);
        Integer[] genArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            genArray[i] = random.nextInt(max - min) + min;
        }

        Arrays.sort(genArray);
        return genArray;
    }

    /**
     * 提供一个限定项数、最大、最小值的排好序的整型数组
     *
     * @param n   数组长度
     * @param min 数组元素最小可能值
     * @param max 数组元素最大可能值
     * @return 排好序的随机数组
     */
    public static Integer[] genSortedIntArray(int n, int min, int max) {
        return genSortedIntArray(n, min, max, new Date().getTime());
    }
}