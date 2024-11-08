package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S62Test {

    @Test
    void uniquePaths() {
        S62 s62 = new S62();
        assertEquals(28, s62.uniquePaths(3, 7));
        assertEquals(3, s62.uniquePaths(3, 2));
        assertEquals(6, s62.uniquePaths(3, 3));
    }
}