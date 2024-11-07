package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S740Test {

    @Test
    void deleteAndEarn() {
        S740 s740 = new S740();
        assertEquals(6, s740.deleteAndEarn(new int[] {3,4,2}));
        assertEquals(9, s740.deleteAndEarn(new int[] {2,2,3,3,3,4}));
    }
}