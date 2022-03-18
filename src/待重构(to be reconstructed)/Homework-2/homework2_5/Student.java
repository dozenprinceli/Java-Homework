package homework2_5;

/**
 * Student类。通过学号、姓名、年龄初始化一个学生对象，可以查询学生信息
 */
public class Student {
    private int stuNo,age;
    private String name;

    /**
     * 初始化一个学生对象
     * @param stuNo 学生的学号
     * @param name 学生姓名
     * @param age 学生的年龄
     * @throws IllegalArgumentException("AgeRangeException") 若输入的学生年龄为负数
     */
    public Student(int stuNo, String name, int age) {
        this.stuNo = stuNo;
        
        // Exception handling
        if(age < 0) throw new IllegalArgumentException("AgeRangeException");
        this.age = age;
        
        this.name = name;
    }

    /**
     * 输出学生信息
     */
    public void outPut() {
        System.out.print("学号: " + stuNo + ", ");
        System.out.print("姓名: " + name + ", ");
        System.out.println("年龄: " + age);
    }
}