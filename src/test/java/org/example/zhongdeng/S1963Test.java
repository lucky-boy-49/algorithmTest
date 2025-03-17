package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S1963Test {

    @Test
    void minSwaps() {
        S1963 s1963 = new S1963();
        Assertions.assertEquals(2, s1963.minSwaps("]]][[["));
        Assertions.assertEquals(1, s1963.minSwaps("][]["));
        Assertions.assertEquals(2, s1963.minSwaps("[[[]]]][][]][[]]][[["));
    }
}