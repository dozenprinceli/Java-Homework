package homework3_6;

public class B implements InterfaceA {
    @Override
    public int method(int n) {
        int factorial = 1;
        for(int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}