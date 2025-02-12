package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S1760Test {

    @Test
    void minimumSize() {
        S1760 s1760 = new S1760();
        assertEquals(2, s1760.minimumSize(new int[]{2, 4, 8, 2},
                4));
    }
}