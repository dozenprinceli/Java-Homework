import java.util.Arrays;
import java.util.Scanner;

public class homework1_5 {
    public static void main(String[] args) {
        double[] NumList = new double[10];
        for (int i = 0;i <= 9;i++) {
            NumList[i] = 3.9 * i - 5;
        }
        double[] NewList = new double[NumList.length + 1];
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        double NewNum = input.nextDouble();
        input.close();
        if (NewNum < NumList[0]) {
            NewList[0] = NewNum;
            for (int i = 1;i <= NewList.length - 1;i++) {
                NewList[i] = NumList[i - 1];
            }
        }else if (NewNum >= NumList[NumList.length - 1]) {
            for (int i = 0;i <= NewList.length - 2;i++) {
                NewList[i] = NumList[i];
            }
            NewList[NewList.length - 1] = NewNum;
        }else {
            int position = 0;
            for (int i = 0;i <= NumList.length - 1;i++) {
                position++;
                if (NewNum >= NumList[i] && NewNum < NumList[i + 1]) break;
            }
            for (int i = 0;i < position;i++) {
                NewList[i] = NumList[i];
            }
            NewList[position] = NewNum;
            for (int i = position;i <= NewList.length - 2;i++) {
                NewList[i + 1] = NumList[i];
            }
        }
        System.out.println(Arrays.toString(NewList));
    }
}