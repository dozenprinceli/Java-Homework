import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
 */
public class homework1_6 {
    static Scanner inputStream = new Scanner(System.in);
    
    /**
     * 通过键盘输入获取整型列表
     * 
     * @return 键盘输入的值构成的整型列表
     */
    private List<Integer> getArray() {
        System.out.println("输入一个数组，用空格分隔元素");
        Scanner inputScanner = inputStream;
        String inputStr = inputScanner.nextLine();
        String[] inputStrList = inputStr.split("\u0020");
        List<Integer> inputList = new ArrayList<Integer>();
        for (String str : inputStrList) inputList.add(Integer.valueOf(str));
        return inputList;
    }

    /**
     * 正向将列表的每个元素往后移动指定距离
     * 
     * @param inputList 待操作的整型列表
     * @param moveStep 移动距离
     * @return 移动操作过后得到的列表
     * @throws IllegalArgumentException("MoveStepOutOfBoundsException") 如果输入的移动距离为负数或超过数组长度
     */
    private List<Integer> moveArray(List<Integer> inputList, int moveStep) {
        if (moveStep < 0 || inputList.size() < moveStep) throw (new IllegalArgumentException("MoveStepOutOfBoundsException"));
        List<Integer> subListFirst = inputList.subList(0, inputList.size() - moveStep);
        List<Integer> subListLast = inputList.subList(inputList.size() - moveStep, inputList.size());
        List<Integer> newList = new ArrayList<Integer>();
        newList.addAll(subListLast); newList.addAll(subListFirst);
        return newList;
    }
    
    public static void main(String[] args) {
        homework1_6 temp = new homework1_6();
        List<Integer> inputList = temp.getArray();
        System.out.println("输入移动距离");
        Scanner inputMoveStep = inputStream;
        int moveStep = inputMoveStep.nextInt();
        System.out.println("移动后的新列表为\n" + temp.moveArray(inputList, moveStep).toString());
        inputStream.close();
    }
}