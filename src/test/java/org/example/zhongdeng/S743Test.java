package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S743Test {

    @Test
    void networkDelayTime() {
        S743 s743 = new S743();
        assertEquals(3, s743.networkDelayTime(new int[][]{{1, 2, 1}, {2, 1, 3}},
                2, 2));
        assertEquals(2, s743.networkDelayTime(new int[][]{{2, 1, 1}, {2, 3, 1}, {3, 4, 1}},
                4, 2));
        assertEquals(2, s743.networkDelayTime(new int[][]{{1, 2, 1}, {2, 3, 2}, {1, 3, 2}},
                3, 1));
    }
}