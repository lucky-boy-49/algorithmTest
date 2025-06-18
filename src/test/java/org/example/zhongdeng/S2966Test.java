package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class S2966Test {

    @Test
    void divideArray() {
        S2966 s2966 = new S2966();
        System.out.println(Arrays.deepToString(s2966.divideArray(new int[]{1, 3, 4, 8, 7, 9, 3, 5, 1}, 2)));
        System.out.println(Arrays.deepToString(s2966.divideArray(new int[]{2, 4, 2, 2, 5, 2}, 2)));
    }
}