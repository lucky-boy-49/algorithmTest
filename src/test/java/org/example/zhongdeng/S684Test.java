package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S684Test {

    @Test
    void findRedundantConnection() {
        S684 s684 = new S684();
        assertArrayEquals(new int[] {1, 4}, s684.findRedundantConnection(
                new int[][] {{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}}));
    }
}