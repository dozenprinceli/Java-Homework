package homework2_6;

public class Print {
    char ch;
    void output(int x) {
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
        
        else System.out.println("Input Number Range Error!");
    }
}