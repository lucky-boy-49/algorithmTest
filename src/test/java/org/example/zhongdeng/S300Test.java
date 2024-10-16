package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S300Test {

    @Test
    void lengthOfLIS() {
        S300 s300 = new S300();
        assertEquals(6, s300.lengthOfLIS(new int[] {1,3,6,7,9,4,10,5,6}));
    }

    @Test
    void lengthOfLIS2() {
        S300 s300 = new S300();
        assertEquals(6, s300.lengthOfLIS2(new int[] {1,3,6,7,9,4,10,5,6}));
    }
}