package homework2_6;

/**
 * TestClass类，用于测试Print类
 */
public class TestClass {
    public static void main(String[] args) {
        Print capitalAlphabet = new Print();
        Print alphabet = new Print();

        capitalAlphabet.output(Print.UPPERCASE);
        alphabet.output(Print.LOWERCASE);
    }
}