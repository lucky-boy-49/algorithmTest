package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S2711Test {

    @Test
    void differenceOfDistinctValues() {
        S2711 s2711 = new S2711();
        Assertions.assertArrayEquals(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 1, 1}},
                s2711.differenceOfDistinctValues(new int[][]{
                        {1, 2, 3}, {3, 1, 5}, {3, 2, 1}
                }));
        Assertions.assertArrayEquals(new int[][]{{3, 3, 3, 3, 3, 3, 2, 1, 0}, {2, 1, 1, 1, 1, 1, 1, 0, 1}, {1, 0, 1, 1, 1, 1, 1, 1, 2}, {0, 1, 2, 3, 3, 3, 3, 3, 3}},
                s2711.differenceOfDistinctValues(new int[][]{
                        {6, 28, 37, 34, 12, 30, 43, 35, 6}, {21, 47, 38, 14, 31, 49, 11, 14, 49}, {6, 12, 35, 17, 17, 2, 45, 27, 43}, {34, 41, 30, 28, 45, 24, 50, 20, 4}
                }));
    }
}