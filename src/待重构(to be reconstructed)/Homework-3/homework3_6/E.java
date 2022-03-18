package homework3_6;

public class E {
    public static void main(String[] args) {
        InterfaceA Sum = new A();
        System.out.println("Sum from 1 to 10 is " + Sum.method(10));
        
        InterfaceA Fac = new B();
        System.out.println("Factorial of 10 is " + Fac.method(10));
    }
}