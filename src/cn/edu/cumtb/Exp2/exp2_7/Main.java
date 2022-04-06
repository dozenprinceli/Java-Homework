package pers.dozenlee.exp.exp2.exp2_7;

public class Main {
    public static void main(String[] args) {
        People people = new People("张三", 18, Sexual.MALE, 1.80D);
        people.speak("你好!");
        System.out.println("23 + 45 = " + people.add(23, 45));
        people.changeName("李四");
        System.out.println("新名字为:" + people.getName());
    }
}
