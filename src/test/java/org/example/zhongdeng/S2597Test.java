package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S2597Test {

    @Test
    void beautifulSubsets() {
        assertEquals(4, new S2597().beautifulSubsets(new int[]{2, 4, 6}, 2));
        assertEquals(1, new S2597().beautifulSubsets(new int[]{1}, 1));
        assertEquals(23, new S2597().beautifulSubsets(new int[]{4, 2, 5, 9, 10, 3}, 1));
        assertEquals(23, new S2597().beautifulSubsets(new int[]{10, 4, 5, 7, 2, 1}, 3));
    }
}
