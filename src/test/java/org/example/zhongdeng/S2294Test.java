package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S2294Test {

    @Test
    void partitionArray() {
        S2294 s2294 = new S2294();
        assertEquals(2, s2294.partitionArray(new int[]{3, 6, 1, 2, 5}, 2));
        assertEquals(2, s2294.partitionArray(new int[]{1, 2, 3}, 1));
        assertEquals(3, s2294.partitionArray(new int[]{2, 2, 4, 5}, 0));
    }
}