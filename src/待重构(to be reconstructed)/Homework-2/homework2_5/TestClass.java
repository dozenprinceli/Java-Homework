package homework2_5;

/**
 * 测试类TestClass，用于测试Student类
 */
public class TestClass {
    public static void main(String[] args) {
        Student stu1 = new Student(1810730219, "王雷", 21);
        Student stu2 = new Student(1710320225, "李彤", 22);
        Student stu3 = new Student(1910250108, "洪伟立", 21);

        stu1.outPut();
        stu2.outPut();
        stu3.outPut();
    }
}