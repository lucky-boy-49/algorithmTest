package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S1552Test {

    @Test
    void maxDistance() {
        S1552 s1552 = new S1552();
        assertEquals(3, s1552.maxDistance(new int[]{1, 2, 3, 4, 7}, 3));
        assertEquals(999999999, s1552.maxDistance(new int[]{5, 4, 3, 2, 1, 1000000000}, 2));
    }
}