package homework3_7;

public class test {
    public static void main(String[] args) {
        Compute sum = new doPlus();
        Compute dif = new doMinus();
        Compute product = new doMutiply();
        Compute quotient = new doDivide();
        UseCompute com = new UseCompute();

        int one = 80;
        int two = 5;

        System.out.print("测试加法\n80+5=");
        com.useCom(sum, one, two);
        System.out.print("测试减法\n80-5=");
        com.useCom(dif, one, two);
        System.out.print("测试乘法\n80*5=");
        com.useCom(product, one, two);
        System.out.print("测试除法\n80/5=");
        com.useCom(quotient, one, two);
    }
}