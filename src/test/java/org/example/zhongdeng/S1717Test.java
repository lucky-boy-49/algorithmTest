package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S1717Test {

    @Test
    void maximumGain() {
        S1717 s1717 = new S1717();
        assertEquals(19, s1717.maximumGain("cdbcbbaaabab", 4, 5));
        assertEquals(20, s1717.maximumGain("aabbaaxybbaabb", 5, 4));
    }
}