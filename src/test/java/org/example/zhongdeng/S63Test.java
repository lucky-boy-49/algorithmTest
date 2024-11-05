package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S63Test {

    @Test
    void uniquePathsWithObstacles() {
        S63 s63 = new S63();
        assertEquals(2, s63.uniquePathsWithObstacles(new int[][]{{0,0,0}, {0,1,0}, {0,0,0}}));
        assertEquals(0, s63.uniquePathsWithObstacles(new int[][]{{1,0,0,0,0,0}, {0,1,0,1,0,0}}));
    }
}