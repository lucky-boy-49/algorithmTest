package org.example.zhongdeng;

import org.junit.Test;

import static org.junit.Assert.*;

public class S1845Test {
    @Test
    public void s1845() {
        S1845 s1845 = new S1845(5);
        assertEquals(1, s1845.reserve());
        assertEquals(2, s1845.reserve());
        s1845.unreserve(2);
        assertEquals(2, s1845.reserve());
        assertEquals(3, s1845.reserve());
        assertEquals(4, s1845.reserve());
        assertEquals(5, s1845.reserve());
        s1845.unreserve(5);
    }
}