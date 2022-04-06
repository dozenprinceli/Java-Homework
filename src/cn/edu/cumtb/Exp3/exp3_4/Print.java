package pers.dozenlee.exp.exp3.exp3_4;

/**
 * @author DozenPrince Li
 * @date 2022/3/25
 */
public class Print implements InterfaceA, InterfaceB {

    @Override
    public void printCapitalLetter() {
        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.print((char)i);
        }
        System.out.println();
    }

    @Override
    public void printLowercaseLetter() {
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.print((char)i);
        }
        System.out.println();
    }
}
