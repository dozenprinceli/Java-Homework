package pers.dozenlee.exp.exp2.exp2_1;

import java.util.Random;

/**
 * 用于测试Ladder与Circle类的主类
 */
public class A {
    public static void main(String[] args) {
        Test test = new Test(100000);
        test.testCircle();
        test.testLadder();
    }
}

@SuppressWarnings("FieldMayBeFinal")
class Test {
    private final Random random = new Random();

    private final String PASS_PREFIX = "Passed the ";
    private final String FAIL_PASS_PREFIX = "Failed to pass the ";

    private int bounds = 10000;
    private int times;

    Test(int times) {
        if (times < 0) {
            throw new IllegalArgumentException("Test times should be positive!");
        }
        this.times = times;
    }

    void testLadder() {
        String ladderTestStr = "\"Ladder Test\"";

        for (int i = 0; i < times; i++) {
            double upper = bounds * random.nextDouble();
            double downer = bounds * random.nextDouble();
            double height = bounds * random.nextDouble();
            Ladder ladder = new Ladder(upper, downer, height);
            if (ladder.getArea() - ((upper + downer) * height / 2) > 1e-15) {
                System.out.println(FAIL_PASS_PREFIX + ladderTestStr);
                return;
            }
        }

        System.out.println(PASS_PREFIX + ladderTestStr);
    }

    void testCircle() {
        String circleTestStr = "\"Circle Test\"";

        for (int i = 0; i < times; i++) {
            double radius = bounds * random.nextDouble();
            Circle circle = new Circle(radius);
            if (circle.getArea() - radius * radius * Math.PI > 1e-15) {
                System.out.println(FAIL_PASS_PREFIX + circleTestStr + "(Part: Area)");
                return;
            }
            if (circle.getParameter() - 2 * radius * Math.PI > 1e-15) {
                System.out.println(FAIL_PASS_PREFIX + circleTestStr + "(Part: Parameter");
                return;
            }
        }

        System.out.println(PASS_PREFIX + circleTestStr);
    }
}
