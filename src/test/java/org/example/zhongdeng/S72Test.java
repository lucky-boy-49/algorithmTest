package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S72Test {

    @Test
    void minDistance() {
        S72 s72 = new S72();
        assertEquals(5, s72.minDistance("intention", "execution"));
        assertEquals(1, s72.minDistance("", "a"));
    }

    @Test
    void minDistance2() {
        S72 s72 = new S72();
        assertEquals(5, s72.minDistance2("intention", "execution"));
        assertEquals(1, s72.minDistance2("", "a"));
    }
}