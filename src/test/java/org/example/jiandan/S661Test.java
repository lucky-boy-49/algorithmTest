package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S661Test {

    @Test
    void imageSmoother() {
        S661 s661 = new S661();
        assertArrayEquals(new int[][] {{0, 0, 0},{0, 0, 0}, {0, 0, 0}},
                s661.imageSmoother(new int[][]{
                        {1,1,1},{1,0,1},{1,1,1}
                }));
        assertArrayEquals(new int[][] {{137,141,137},{141,138,141},{137,141,137}},
                s661.imageSmoother(new int[][]{
                        {100,200,100},{200,50,200},{100,200,100}
                }));
    }
}