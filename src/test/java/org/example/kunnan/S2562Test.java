package org.example.kunnan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S2562Test {

    @Test
    void maximumBeauty() {
        S2562 s2562 = new S2562();
        Assertions.assertEquals(14, s2562.maximumBeauty(
                new int[]{1, 3, 1, 1},
                7, 6, 12, 1
        ));
        Assertions.assertEquals(30, s2562.maximumBeauty(
                new int[]{2, 4, 5, 3},
                10, 5, 2, 6
        ));
        Assertions.assertEquals(75, s2562.maximumBeauty(
                new int[]{18, 16, 10, 10, 5},
                10, 3, 15, 4
        ));
        Assertions.assertEquals(54, s2562.maximumBeauty(
                new int[]{8, 2},
                24, 18, 6, 3
        ));
        Assertions.assertEquals(47, s2562.maximumBeauty(
                new int[]{5, 19, 1, 1, 6, 10, 18, 12, 20, 10, 11},
                6, 20, 3, 11
        ));
    }
}