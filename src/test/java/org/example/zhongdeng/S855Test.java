package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S855Test {
    @Test
    void test() {
        S855 s855 = new S855(10);
        Assertions.assertEquals(0, s855.seat());
        Assertions.assertEquals(9, s855.seat());
        Assertions.assertEquals(4, s855.seat());
        Assertions.assertEquals(2, s855.seat());
        s855.leave(4);
        Assertions.assertEquals(5, s855.seat());
    }

    @Test
    void test2() {
        S855 s855 = new S855(4);
        Assertions.assertEquals(0, s855.seat());
        Assertions.assertEquals(3, s855.seat());
        Assertions.assertEquals(1, s855.seat());
        Assertions.assertEquals(2, s855.seat());
        s855.leave(1);
        s855.leave(3);
        Assertions.assertEquals(1, s855.seat());
    }

    @Test
    void test3() {
        S855 s855 = new S855(10);
        Assertions.assertEquals(0, s855.seat());
        Assertions.assertEquals(9, s855.seat());
        Assertions.assertEquals(4, s855.seat());
        s855.leave(0);
        s855.leave(4);
        Assertions.assertEquals(0, s855.seat());
        Assertions.assertEquals(4, s855.seat());
        Assertions.assertEquals(2, s855.seat());
        Assertions.assertEquals(6, s855.seat());
        Assertions.assertEquals(1, s855.seat());
        Assertions.assertEquals(3, s855.seat());
        Assertions.assertEquals(5, s855.seat());
        Assertions.assertEquals(7, s855.seat());
        Assertions.assertEquals(8, s855.seat());
        s855.leave(0);
    }

    @Test
    void test4() {
        S855 s855 = new S855(8);
        Assertions.assertEquals(0, s855.seat());
        Assertions.assertEquals(7, s855.seat());
        Assertions.assertEquals(3, s855.seat());
        s855.leave(0);
        s855.leave(7);
        Assertions.assertEquals(7, s855.seat());
        Assertions.assertEquals(0, s855.seat());
        Assertions.assertEquals(5, s855.seat());
        Assertions.assertEquals(1, s855.seat());
        Assertions.assertEquals(2, s855.seat());
        Assertions.assertEquals(4, s855.seat());
        Assertions.assertEquals(6, s855.seat());
        s855.leave(0);
    }

}