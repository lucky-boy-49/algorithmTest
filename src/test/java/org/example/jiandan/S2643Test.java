package org.example.jiandan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S2643Test {

    @Test
    void rowAndMaximumOnes() {
        S2643 s2643 = new S2643();
        Assertions.assertArrayEquals(new int[]{0, 3},
                s2643.rowAndMaximumOnes(new int[][]{
                        {1, 1, 1, 0, 0}, {1, 0, 0, 0, 1}
                }));
    }
}