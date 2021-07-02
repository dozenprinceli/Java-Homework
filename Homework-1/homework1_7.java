import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组
 */
public class homework1_7 {
    
    static Scanner inputStream = new Scanner(System.in);
    
    /**
     * 获取键盘输入的double型列表
     * 
     * @return 键盘输入的列表
     */
    private List<Double> getList() {
        System.out.println("Input an array, split numbers with a space");
        Scanner inputScanner = inputStream;
        String inputStr = inputScanner.nextLine();
        String[] inputStrList = inputStr.split("\u0020");
        List<Double> inputList = new ArrayList<Double>();
        for (String str : inputStrList) inputList.add(Double.valueOf(str));
        return inputList;
    }

    /**
     * 对列表进行操作：最大的元素与第一个角换，最小的元素与最后一个交换
     * 
     * @param inputList 输入的列表
     * @return 操作后获得的新列表
     */
    private List<Double> operateList(List<Double> inputList) {
        Double maxNum = Collections.max(inputList);
        Double minNum = Collections.min(inputList);
        inputList.set(inputList.indexOf(maxNum), inputList.get(0));
        inputList.set(0, maxNum);
        inputList.set(inputList.indexOf(minNum), inputList.get(inputList.size() - 1));
        inputList.set(inputList.size() - 1, minNum);
        return inputList;
    }
    
    public static void main(String[] args) {
        homework1_7 temp = new homework1_7();
        List<Double> inputList = temp.getList();
        System.out.println("新列表为\n" + temp.operateList(inputList).toString());
        inputStream.close();
    }
    
}