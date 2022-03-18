package cn.edu.cumtb.Exp1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exp1_5UtilTest {

    @Test
    void sortedInsert() {
        Integer[] intArr = {1, 2, 3, 3, 5, 6, 7, 9};
        Integer[] resIntArr = {1, 2, 2, 3, 3, 5, 6, 7, 9};
        assertArrayEquals(resIntArr, Exp1_5Util.sortedInsert(intArr, 2));

        Integer[] wrongIntArr = {1, 1, 2, 3, 5, 4, 6, 9};
        assertThrows(IllegalArgumentException.class, () -> {
            Exp1_5Util.sortedInsert(wrongIntArr, 2);
                });
    }

    @Test
    void genSortedIntArray() {
    }

    @Test
    void testGenSortedIntArray() {
    }
}