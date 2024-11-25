package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S1027Test {

    @Test
    void longestArithSeqLength() {
        S1027 s1027 = new S1027();
        assertEquals(4, s1027.longestArithSeqLength(new int[]{3, 6, 9, 12}));
    }
}