package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S712Test {

    @Test
    void minimumDeleteSum() {
        S712 s712 = new S712();
        assertEquals(231, s712.minimumDeleteSum("sea", "eat"));
        assertEquals(403, s712.minimumDeleteSum("delete", "leet"));
    }

    @Test
    void minimumDeleteSum2() {
        S712 s712 = new S712();
        assertEquals(231, s712.minimumDeleteSum2("sea", "eat"));
        assertEquals(403, s712.minimumDeleteSum2("delete", "leet"));
    }

}