package homework2_7;

/**
 * Test类，用于测试People类
 */
public class Test {
    public static void main(String[] args) {
        People people_1 = new People("张三", 18, 1.80, People.MALE);

        people_1.Talk("你好！");
        people_1.doPlus(23, 45);
        people_1.changeName("李四");
        System.out.println("The new name is " + people_1.getName());
    }
}