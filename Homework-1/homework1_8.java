import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

/**
 * 某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的
 * 加密规则如下：
 *     每位数字都加上5，然后用和除以10的余数代替该数字，
 *     再将第一位和第四位交换，第二位和第三位交换
 */
public class homework1_8 {
    
    /**
     * 对一个四位整数进行加密，规则如下：先将每位数字加上5，再用除以10的余数代替原数；再将第一位与第四位交换、第二位与第三位交换
     * 
     * @param inputInt 输入的四位整数
     * @return 加密后的数字
     * @throws IllegalArgumentException("InputNumberRangeException") 如果输入的数字不是四位整数
     */
    private int encode(int inputInt) {
        if (!(1000 <= inputInt && inputInt <= 9999)) throw (new IllegalArgumentException("InputNumberRangeException"));
        List<Integer> list = Arrays.asList(inputInt / 1000, inputInt % 1000 / 100, inputInt % 100 / 10, inputInt % 10);
        for (int i : list) Collections.replaceAll(list, i, (i + 5) % 10);
        Collections.swap(list, 0, 3);
        Collections.swap(list, 1, 2);
        return list.get(0) * 1000 + list.get(1) * 100 + list.get(2) * 10 + list.get(3);
    }
    
    public static void main(String[] args) {
        System.out.println("输入一个待加密的四位整数:");
        Scanner inputStream = new Scanner(System.in);
        int inputInt = inputStream.nextInt();
        inputStream.close();
        System.out.printf("给 %d 加密后的结果为 %d", inputInt, new homework1_8().encode(inputInt));
    }

}