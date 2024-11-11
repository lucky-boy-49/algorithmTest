package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S931Test {

    @Test
    void minFallingPathSum() {
        S931 s931 = new S931();
        assertEquals(-27, s931.minFallingPathSum(new int[][] {{17,82}, {1,-44}}));
    }
}