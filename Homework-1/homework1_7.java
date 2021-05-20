import java.util.Arrays;
import java.util.Scanner;

public class homework1_7 {
    public static void main(String[] args) {
        System.out.println("Enter numbers as an array, splited with ','");
        Scanner input = new Scanner(System.in);
        String str = input.next().toString();
        input.close();
        String[] Str = str.split(",");
        Double[] array = new Double[Str.length];
        for (int i = 0;i < array.length;i++) array[i] = Double.valueOf(Str[i]);
        Double[] maxInfo = findMax(array);
        Double[] minInfo = findMin(array);
        int maxPosition = maxInfo[1].intValue();
        array[maxPosition] = array[0];
        array[0] = maxInfo[0];
        int minPosition = minInfo[1].intValue();
        array[minPosition] = array[array.length - 1];
        array[array.length - 1] = minInfo[0];
        System.out.println(Arrays.toString(array));
    }

    public static Double[] findMax(Double[] array) {
        Double max=array[0],maxPosition=0.0;
        for (int i = 1;i < array.length;i++) {
            if (max < array[i]) {
                max = array[i];
                maxPosition = Double.valueOf(i);
            }
        }
        Double[] result = {max, maxPosition};
        return result;
    }
    
    public static Double[] findMin(Double[] array) {
        Double min=array[0],minPosition=0.0;
        for (int i = 1;i < array.length;i++) {
            if (min > array[i]) {
                min = array[i];
                minPosition = Double.valueOf(i);
            }
        }
        Double[] result = {min, minPosition};
        return result;
    }
}