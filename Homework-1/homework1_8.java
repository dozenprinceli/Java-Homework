import java.util.Scanner;

public class homework1_8 {
    public static void main(String[] args) {
        System.out.println("Enter the 4-number integer:");
        Scanner input = new Scanner(System.in);
        int oriNum = input.nextInt();
        input.close();
        if (!(oriNum >= 1000 && oriNum <= 9999)) {
            System.out.println("Number Input Range ERROR");
            System.exit(1);
        }
        int[] SepNum = new int[4];
        SepNum[0] = oriNum / 1000;
        SepNum[1] = oriNum % 1000 / 100;
        SepNum[2] = oriNum % 100 / 10;
        SepNum[3] = oriNum % 10;
        for (int i = 0;i < SepNum.length;i++) {
            SepNum[i] += 5;
            SepNum[i] %= 10;
        }
        int temp;
        temp = SepNum[0];
        SepNum[0] = SepNum[3];
        SepNum[3] = temp;
        temp = SepNum[1];
        SepNum[1] = SepNum[2];
        SepNum[2] = temp;
        String result="\0";
        for (int i = 0;i < SepNum.length;i++) result += String.valueOf(SepNum[i]);
        System.out.println(result);
    }
}