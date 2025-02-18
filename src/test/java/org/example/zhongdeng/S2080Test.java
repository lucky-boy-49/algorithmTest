package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S2080Test {
    @Test
    void test() {
        S2080 s2080 = new S2080(new int[]{12, 33, 4, 56, 22, 2, 34, 33, 22, 12, 34, 56});
        Assertions.assertEquals(1, s2080.query(1, 2, 4));
        Assertions.assertEquals(2, s2080.query(0, 11, 33));
    }

    @Test
    void test2() {
        S2080 s2080 = new S2080(new int[]{1, 1, 1, 2, 2});
        Assertions.assertEquals(0, s2080.query(0, 1, 2));
        Assertions.assertEquals(3, s2080.query(0, 2, 1));
        Assertions.assertEquals(1, s2080.query(3, 3, 2));
        Assertions.assertEquals(1, s2080.query(2, 2, 1));
    }
}