package org.example.kunnan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S685Test {

    @Test
    void findRedundantDirectedConnection() {
        S685 s685 = new S685();
        assertArrayEquals(new int[] {4,1}, s685.findRedundantDirectedConnection(
                new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 1}, {1, 5}}));
    }
}