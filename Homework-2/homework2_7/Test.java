package homework2_7;

public class Test {
    public static void main(String[] args) {
        People people_1 = new People("张三",18,1.80,"男");
        people_1.Talk("你好！");
        people_1.doPlus(23, 45);
        people_1.changeName("李四");
        System.out.println("The new name is " + people_1.name);
    }
}