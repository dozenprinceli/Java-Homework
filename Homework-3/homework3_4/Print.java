package homework3_4;

public class Print implements InterfaceA, InterfaceB {
    @Override
    public void printCapitalLetter() {
        System.out.println("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    }

    @Override
    public void printLowercaseLetter() {
        System.out.println("abcdefghijklmnopqrstuvwxyz");
    }
}