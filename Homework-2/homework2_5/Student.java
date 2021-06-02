package homework2_5;

public class Student {
    int stuNo,age;
    String name;

    Student(int stuNo, String name, int age) {
        this.stuNo = stuNo;
        this.age = age;
        this.name = name;
    }

    void outPut() {
        System.out.println(stuNo + "," + name + "," + age);
    }
}