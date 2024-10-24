package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S64Test {

    @Test
    void minPathSum() {
        S64 s64 = new S64();
        assertEquals(7, s64.minPathSum(new int[][] {{1,3,1},{1,5,1},{4,2,1}}));
    }

}