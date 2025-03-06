package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S2588Test {

    @Test
    void beautifulSubarrays() {
        S2588 s2588 = new S2588();
        Assertions.assertEquals(2, s2588.beautifulSubarrays(new int[]{4, 3, 1, 2, 4}));
        Assertions.assertEquals(0, s2588.beautifulSubarrays(new int[]{1, 10, 4}));
        Assertions.assertEquals(1, s2588.beautifulSubarrays(new int[]{0}));
    }
}