package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S16Test {

    @Test
    void threeSumClosest() {
        S16 s16 = new S16();
        Assertions.assertEquals(2, s16.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
        Assertions.assertEquals(0, s16.threeSumClosest(new int[]{0, 0, 0}, 1));
        Assertions.assertEquals(-2, s16.threeSumClosest(new int[]{4, 0, 5, -5, 3, 3, 0, -4, -5}, -2));
    }
}