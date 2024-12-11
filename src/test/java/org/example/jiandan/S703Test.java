package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S703Test {

    @Test
    void test() {
        S703 s703 = new S703(3, new int[]{4, 5, 8, 2});
        assertEquals(4, s703.add(3));
        assertEquals(5, s703.add(5));
        assertEquals(5, s703.add(10));
        assertEquals(8, s703.add(9));
        assertEquals(8, s703.add(4));
    }

    @Test
    void test2() {
        S703 s703 = new S703(1, new int[]{});
        assertEquals(-3, s703.add(-3));
        assertEquals(-2, s703.add(-2));
        assertEquals(-2, s703.add(-4));
        assertEquals(0, s703.add(0));
        assertEquals(4, s703.add(4));
    }

}