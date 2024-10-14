package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S322Test {

    @Test
    void coinChange() {
        S322 s322 = new S322();
        assertEquals(0, s322.coinChange(new int[]{186, 419, 83, 408}, 6249));
    }
}