package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S2349Test {
    @Test
    public void test() {
        S2349 s2349 = new S2349();
        assertEquals(-1, s2349.find(10));
        s2349.change(2, 10);
        s2349.change(1, 10);
        s2349.change(3, 10);
        s2349.change(5, 10);
        assertEquals(1, s2349.find(10));
        s2349.change(1, 20);
        assertEquals(2, s2349.find(10));
    }
}