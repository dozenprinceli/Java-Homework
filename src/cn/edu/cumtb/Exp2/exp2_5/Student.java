package pers.dozenlee.exp.exp2.exp2_5;

@SuppressWarnings({"FieldMayBeFinal", "unused"})
public class Student {
    private int stuNo;
    private String name;
    private int age;

    public Student(int stuNo, String name, int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Illegal age!");
        }
        if (stuNo < 0) {
            throw new IllegalArgumentException("Illegal student number!");
        }

        this.stuNo = stuNo;
        this.name = name;
        this.age = age;
    }

    public void outPut() {
        System.out.println("学生姓名:" + name + "\t学号:" + stuNo + "\t年龄:" + age);
    }
}
