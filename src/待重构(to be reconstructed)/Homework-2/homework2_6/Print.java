package homework2_6;

/**
 * Print类。用于输出大小写英文字母表
 */
public class Print {
    public final static int UPPERCASE = 1;
    public final static int LOWERCASE = 2;
    
    /**
     * 在控制台输出大小写英文字母表
     * @param x 决定字母表类型。1为大写，2为小写
     * @throws IllegalArgumentException("InputXRangeException") 若输入的x值不为1或2
     */
    public void output(int x) {
        char ch;
        if(x == 1) {
            ch = 65;
            while(ch <= 90) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println("\0");
        }
        else if(x == 2) {
            ch = 97;
            while(ch <= 122) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println("\0");
        }
        // Exception handling
        else throw new IllegalArgumentException("InputXRangeException");
    }
}