package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S646Test {

    @Test
    void findLongestChain() {
        S646 s646 = new S646();
        assertEquals(2, s646.findLongestChain(new int[][] {{1, 2}, {2, 3}, {3, 4}}));
        assertEquals(3, s646.findLongestChain(new int[][] {{1, 2}, {7, 8}, {4, 5}}));
    }
}