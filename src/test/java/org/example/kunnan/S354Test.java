package org.example.kunnan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S354Test {

    @Test
    void maxEnvelopes() {
        S354 s354 = new S354();
        assertEquals(3, s354.maxEnvelopes(new int[][]{{5, 4}, {6, 4}, {6, 7}, {2, 3}}));
        assertEquals(1, s354.maxEnvelopes(new int[][]{{1, 1}, {1, 1}, {1, 1}}));
        assertEquals(3, s354.maxEnvelopes(new int[][]{{46, 89}, {50, 53}, {52, 68}, {72, 45}, {77, 81}}));
        assertEquals(4, s354.maxEnvelopes(new int[][]{{4, 5}, {4, 6}, {6, 7}, {2, 3}, {1, 1}}));
        assertEquals(5, s354.maxEnvelopes(new int[][]{{15, 8}, {2, 20}, {2, 14}, {4, 17}, {8, 19}, {8, 9}, {5, 7}, {11, 19}, {8, 11}, {13, 11}, {2, 13}, {11, 19}, {8, 11}, {13, 11}, {2, 13}, {11, 19}, {16, 1}, {18, 13}, {14, 17}, {18, 19}}));
    }
}