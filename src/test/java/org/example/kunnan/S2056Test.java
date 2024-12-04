package org.example.kunnan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S2056Test {

    @Test
    void countCombinations() {
        S2056 s2056 = new S2056();
        assertEquals(15, s2056.countCombinations(
                new String[]{"rook"},
                new int[][]{{1, 1}}));
        assertEquals(22, s2056.countCombinations(
                new String[]{"queen"},
                new int[][]{{1, 1}}));
        assertEquals(12, s2056.countCombinations(
                new String[]{"bishop"},
                new int[][]{{4, 3}}));
        assertEquals(223, s2056.countCombinations(
                new String[]{"rook", "rook"},
                new int[][]{{1, 1}, {8, 8}}));
        assertEquals(281, s2056.countCombinations(
                new String[]{"queen", "bishop"},
                new int[][]{{5, 7}, {3, 4}}));
        assertEquals(96, s2056.countCombinations(
                new String[]{"bishop", "rook"},
                new int[][]{{8, 5}, {7, 7}}));
    }
}