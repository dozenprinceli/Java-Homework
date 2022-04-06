package pers.dozenlee.exp.exp3.exp3_7;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UseComputeTest {

    @Test
    void useComTest() {
        int testTimes = 10000;
        int testBounds = 2000000;
        Random random = new Random();

        Compute add = new Add();
        Compute subtract = new Subtract();
        Compute multiply = new Multiply();
        Compute divide = new Divide();
        UseCompute useCompute = new UseCompute();

        for (int i = 0; i < testTimes; i++) {
            int one = random.nextInt(testBounds) - testBounds / 2;
            int two = random.nextInt(testBounds) - testBounds / 2;
            assertEquals(one + two, useCompute.useCom(add, one, two));
            assertEquals(one - two, useCompute.useCom(subtract, one, two));
            assertEquals(one * two, useCompute.useCom(multiply, one, two));
            assertEquals(one / two, useCompute.useCom(divide, one, two));
        }
    }
}