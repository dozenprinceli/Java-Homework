package homework3_5;

public class test {
    public static void main(String[] args) {
    Thread t1 = new T("t1");
    Thread t2 = new T("t2");
    Thread t3 = new T("t3");

    t1.start();
    t2.start();
    t3.start();
    }
}