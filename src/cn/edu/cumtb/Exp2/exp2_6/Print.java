package pers.dozenlee.exp.exp2.exp2_6;

public class Print {
    public void output(int x) {
        if (x == 2) {
            for (byte a = (byte) 'a'; a <= (byte) 'z'; a++) {
                System.out.print((char) a);
            }
            System.out.println();
        } else if (x == 1) {
            for (byte a = (byte) 'A'; a <= (byte) 'Z'; a++) {
                System.out.print((char) a);
            }
            System.out.println();
        } else {
            throw new IllegalArgumentException("Illegal input argument!");
        }
    }
}
