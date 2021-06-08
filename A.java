package homework3_6;

public class A implements InterfaceA {
    @Override
    public int method(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}