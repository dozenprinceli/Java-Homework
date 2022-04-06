package pers.dozenlee.exp.exp3.exp3_4;

/**
 * @author DozenPrince Li
 * @date 2022/3/25
 */
public class E {

    public static void main(String[] args) {
        InterfaceA a = new Print();
        a.printCapitalLetter();
        InterfaceB b = new Print();
        b.printLowercaseLetter();
    }
}
