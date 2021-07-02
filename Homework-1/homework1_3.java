/**
 * 有1、2、3、4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 */
public class homework1_3 {
    public static void main(String[] args) {
        
        int count = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i != j) for (int k = 1; k <= 4; k++) {
                    if (k != i && k != j) {
                        count++;
                        System.out.print(Integer.toString(i)+Integer.toString(j)+Integer.toString(k) + "  ");
                    }
                }
            }
        }

        System.out.println("\n共能组成" + count + "个互不相同且无重复数字的三位数");

    }
}