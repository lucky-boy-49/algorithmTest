package org.example.kunnan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S52Test {

    @Test
    void totalNQueens() {
        S52 s52 = new S52();
        assertEquals(2, s52.totalNQueens(4));
        assertEquals(1, s52.totalNQueens(1));
    }
}