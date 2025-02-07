package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class S59Test {

    @Test
    void generateMatrix() {
        S59 s59 = new S59();
        System.out.println(Arrays.deepToString(s59.generateMatrix(3)));
    }
}