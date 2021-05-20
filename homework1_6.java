import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class homework1_6 {
    public static void main(String[] args) {
        System.out.println("Enter the length of the array:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] Array = genArray(n);
        System.out.println("Enter the shuffle length:");
        int m = input.nextInt();
        input.close();
        if (m > n || m < 1) System.exit(1);
        int[] NewArray = shufArray(Array, m);
        System.out.println("The origin array is" + Arrays.toString(Array));
        System.out.println("The 'shuffled' array is" + Arrays.toString(NewArray));
    }

    public static int[] genArray(int n) {
        Random random = new Random();
        int[] array = new int[n];
        for (int i = 0;i < array.length;i++) {
            array[i] = random.nextInt(n * n);
        }
        return array;
    }

    public static int[] shufArray(int[] array, int m) {
        int n = array.length;
        int[] NewArray = new int[n];
        for (int i = 0;i < n - m;i++) NewArray[i + m] = array[i];
        for (int i = n - m;i < n;i++) NewArray[i - n + m] = array[i];
        return NewArray;
    }
}