import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

/**
 * 有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中
 */
public class homework1_5 {
    public static void main(String[] args) {
        System.out.println("输入一个列表，用空格分隔元素");
        Scanner inputScanner = new Scanner(System.in);
        String inputStr = inputScanner.nextLine().toString();
        String[] inputStrArray = inputStr.split("\u0020");
        List<Double> TestList = new ArrayList<Double>();
        for (String str : inputStrArray) TestList.add(Double.valueOf(str));
        
        Collections.sort(TestList);
        System.out.println("排序后的列表为 " + TestList.toString());
        
        System.out.println("输入一个double型的数进行插入操作");
        double insertNum = inputScanner.nextDouble();
        inputScanner.close();
        TestList.add(insertNum);
        Collections.sort(TestList);
        System.out.println("完成插入操作后，新列表为\n" + TestList.toString());
    }
}