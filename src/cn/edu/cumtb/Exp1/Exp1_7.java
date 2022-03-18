package cn.edu.cumtb.Exp1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组
 */
public class Exp1_7 {
    public static void main(String[] args) {
        System.out.println("Please Input An Array(Split With \",\")");
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.next().toString();
        String[] strArray = inputStr.split(",");
        Double[] testArray = new Double[strArray.length];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = Double.parseDouble(strArray[i]);
        }

        System.out.println("The Original Array Is:\n" + Arrays.toString(testArray) + "\n");
        Exp1_7Util.swapMaxMin(testArray);
        System.out.println("The Array After Operation Is:\n" + Arrays.toString(testArray));
    }
}

/**
 * 1_7工具类
 */
class Exp1_7Util {
    /**
     * 交换数组的最大值与最小值
     *
     * @param array 输入数组
     * @param <T> 数组类型
     */
    public static <T extends Number> void swapMaxMin(T[] array) {
        int maxIndex = indexOfMax(array);
        int minIndex = indexOfMin(array);
        swap(array, maxIndex, minIndex);
    }

    /**
     * 获取数组最大值的索引
     *
     * @param array 输入数组
     * @param <T> 数组类型
     * @return 数组最大值的索引，若数组为空则返回-1
     */
    private static <T extends Number> int indexOfMax(T[] array) {
        if (array.length == 0) return -1;

        int index = 0;
        for (int i = 1; i < array.length; i++) {
            index = array[i].doubleValue() > array[index].doubleValue() ? i : index;
        }

        return index;
    }

    /**
     * 获取数组最小值的索引
     *
     * @param array 输入数组
     * @param <T> 数组类型
     * @return 数组最小值的索引，若数组为空则返回-1
     */
    private static <T extends Number> int indexOfMin(T[] array) {
        if (array.length == 0) return -1;

        int index = 0;
        for (int i = 1; i < array.length; i++) {
            index = array[i].doubleValue() < array[index].doubleValue() ? i : index;
        }

        return index;
    }

    /**
     * 交换数组中两个指定索引的元素值
     *
     * @param array  待操作的数组
     * @param index1 索引值1
     * @param index2 索引值2
     * @param <T>    待操作数组的类型
     */
    public static <T extends Number> void swap(T[] array, int index1, int index2) {
        if (index1 == index2) return;

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
