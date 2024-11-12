package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S221Test {

    @Test
    void maximalSquare() {
        S221 s221 = new S221();
        assertEquals(4, s221.maximalSquare(new char[][]{{'1','0','1','0','0'}, {'1','0','1','1','1'},
                {'1','1','1','1','1'}, {'1','0','0','1','0'}}));
        assertEquals(4, s221.maximalSquare(new char[][]{{'1','1'}, {'1','1'}}));
    }

    @Test
    void maximalSquare2() {
        S221 s221 = new S221();
        assertEquals(4, s221.maximalSquare2(new char[][]{{'1','0','1','0','0'}, {'1','0','1','1','1'},
                {'1','1','1','1','1'}, {'1','0','0','1','0'}}));
        assertEquals(4, s221.maximalSquare2(new char[][]{{'1','1'}, {'1','1'}}));
    }

    @Test
    void maximalSquare3() {
        S221 s221 = new S221();
        assertEquals(9, s221.maximalSquare3(new char[][]{{'0','0','0','1'}, {'1','1','0','1'},
                {'1','1','1','1'}, {'0','1','1','1'}, {'0','1','1','1'}}));
        assertEquals(4, s221.maximalSquare3(new char[][]{{'1','1'}, {'1','1'}}));
    }
}