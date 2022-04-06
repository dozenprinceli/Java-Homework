package pers.dozenlee.exp.exp2.exp2_5;

import java.util.Random;

public class TestClass {
    public static void main(String[] args) {
        int testTime = 100;
        Random random = new Random();
        for (int i = 0; i < testTime; i++) {
            Student student = new Student((int) (1e5 + random.nextInt((int) 1e4)), "测试用名",
                    random.nextInt(15) + 16);
            student.outPut();
        }
    }
}
