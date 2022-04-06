package pers.dozenlee.exp.exp2.exp2_4;

import java.util.Random;

public class TestClass {
    public static void main(String[] args) {
        Random random = new Random();
        int testTimes = 100;
        for (int i = 0; i < testTimes; i++) {
            int hh = random.nextInt(24);
            int mm = random.nextInt(60);
            int ss = random.nextInt(60);
            Clock clock = new Clock(hh, mm, ss);
            clock.show();
        }
    }
}
