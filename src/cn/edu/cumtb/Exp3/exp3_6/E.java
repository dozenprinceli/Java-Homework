package pers.dozenlee.exp.exp3.exp3_6;

/**
 * @author DozenPrince Li
 * @date 2022/3/25
 */
public class E {

    public static void main(String[] args) {
        Test test = new Test();
        InterfaceA instanceA = new ClassA();
        InterfaceA instanceB = new ClassB();
        test.testInterfaceA(instanceA);
        test.testInterfaceA(instanceB);
    }
}

class Test {
    public void testInterfaceA(InterfaceA callback) {
        System.out.println(callback.method(10));
    }
}
