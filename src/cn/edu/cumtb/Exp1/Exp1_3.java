package cn.edu.cumtb.Exp1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 1_3异常接口
 */
interface Exp1_3Exception {
    IllegalArgumentException ARRAY_LENGTH_EXCEPTION =
            new IllegalArgumentException("Array Is Too Long!");

    IllegalArgumentException SAME_ELEMENT_EXCEPTION =
            new IllegalArgumentException("Exist Same Elements In Array!");

    IllegalArgumentException INVALID_ELEMENT_EXCEPTION =
            new IllegalArgumentException("Exist Invalid Element(s) In Array!");

    IllegalArgumentException INVALID_ARGUMENT_EXCEPTION =
            new IllegalArgumentException("Invalid Argument!");
}

/**
 * 有1、2、3、4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 */
public class Exp1_3 {
    public static void main(String[] args) {
        Integer[] inputArray = {1, 2, 3, 4};
        int m = 3;
        List<String> outputList = Exp1_3Util.nonSameCombineInArray(inputArray, m);
        System.out.println("总共可以组成 " + outputList.size() + " 个不同的三位数");
        System.out.println("分别为：\n" + outputList);
    }
}

/**
 * 1_3工具类
 */
class Exp1_3Util implements Exp1_3Exception {
    /**
     * 判断数组中是否存在相同元素
     *
     * @param array 输入数组
     * @param <T>   输入数组的类型
     * @return true 存在，false 不存在
     */
    private static <T> boolean sameNumCheck(T[] array) {
        boolean flag = false;

        for (int index = 0; index < array.length - 1; index++) {
            for (T elem : Arrays.copyOfRange(array, index + 1, array.length + 1)) {
                if (elem == array[index]) {
                    flag = true;
                    break;
                }
            }
            if (flag) break;
        }

        return flag;
    }

    /**
     * 判断给定不同个位数可以组成几个互不相同的m位数
     *
     * @param array 包含互不相同的给定个位数的整型数组
     * @param m     组成的数的位数
     * @return 所有m位数的字符串组成的列表
     * @throws IllegalArgumentException ARRAY_LENGTH_EXCEPTION 若数组长度超过10(即必然有重复的个位数或非法元素)
     * @throws IllegalArgumentException SAME_ELEMENT_EXCEPTION 若数组中含有相同元素值
     * @throws IllegalArgumentException INVALID_ARGUMENT_EXCEPTION 若求的m位数大于数组长度或为非正数
     * @throws IllegalArgumentException INVALID_ELEMENT_EXCEPTION 若数组中有非法元素值(即非个位数)
     */
    public static List<String> nonSameCombineInArray(Integer[] array, int m) {
        if (array.length > 10) {
            throw ARRAY_LENGTH_EXCEPTION;
        }
        if (sameNumCheck(array)) {
            throw SAME_ELEMENT_EXCEPTION;
        }
        if (m > array.length || m < 1) {
            throw INVALID_ARGUMENT_EXCEPTION;
        }
        for (Integer elem : array) {
            if (elem < 0 || elem > 9) {
                throw INVALID_ELEMENT_EXCEPTION;
            }
        }

        if (m == 1) {
            List<Integer> intList = Arrays.asList(array);
            return intList.stream().map(String::valueOf).collect(Collectors.toList());
        }

        int recurIndex = 0;
        List<Integer> recurList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            recurList.add(-1);
        }
        List<String> outputList = new ArrayList<>(0);
        permutation(recurList, array, outputList, recurIndex, -1);

        // 特判：删除最高位为0的元素
        for (int i = outputList.size() - 1; i >= 0; i--) {
            if (outputList.get(i).charAt(0) == '0') {
                outputList.remove(i);
            }
        }

        return outputList;
    }

    /**
     * 从给定有n个元素的数组中选m(1<=m<=n)个，将所有可能的排列输出为字符串，并存储在参数outputList中。
     * m的值由参数recurList的长度决定。该方法支持给定数组中含有相同元素值的情况。
     *
     * @param recurList      用于递归调用的列表，列表长度即为每个排列的长度，列表初始值必须为参数otherwiseValue的值(即创建
     *                       该对象时，必须先给对象赋m个元素的初始值)
     * @param inputArray     输入的可选元素的数组
     * @param outputList     所有可能排列构成的列表
     * @param recurIndex     递归调用所需的int参数，初始值必须为0
     * @param otherwiseValue recurList的默认初始值，该值必须为inputArray中不存在的值
     * @param <T>            输入数组和递归列表的类型
     */
    private static <T> void permutation(List<T> recurList, T[] inputArray,
                                        List<String> outputList, int recurIndex, T otherwiseValue) {
        if (recurIndex >= recurList.size()) {
            join2StringList(recurList, outputList);
            return;
        }

        for (T t : inputArray) {
            if (!recurList.contains(t)) {
                // 修改元素值
                recurList.set(recurIndex, t);
            } else {
                continue;
            }

            // 递归修改每个元素
            permutation(recurList, inputArray, outputList, recurIndex + 1, otherwiseValue);
            // 还原递归列表为默认初始值
            recurList.set(recurIndex, otherwiseValue);
        }
    }

    /**
     * 将给定列表转成连续的字符串并加入到指定的字符串列表
     *
     * @param addList    输入的给定列表
     * @param outputList 待加入字符串的列表
     * @param <T>        输入列表的类型
     */
    private static <T> void join2StringList(List<T> addList, List<String> outputList) {
        StringBuilder stringBuilder = new StringBuilder();
        for (T elem : addList) {
            stringBuilder.append(elem);
        }

        outputList.add(stringBuilder.toString());
    }
}