package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S910Test {

    @Test
    void smallestRangeII() {
        S910 s910 = new S910();
        assertEquals(1, s910.smallestRangeII(new int[] {7,8,8}, 5));
    }
}