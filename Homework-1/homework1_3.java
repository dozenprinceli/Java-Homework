public class homework1_3 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1;i <= 4;i++) {
            for (int j = 1;j <= 4;j++) {
                for (int k = 1;k <= 4;k++) {
                    if (i != j && i!= k && k != j) {
                        count++;
                        System.out.println(Integer.toString(i)+Integer.toString(j)+Integer.toString(k));
                    }
                }
            }
        }
        System.out.println(count);
    }
}