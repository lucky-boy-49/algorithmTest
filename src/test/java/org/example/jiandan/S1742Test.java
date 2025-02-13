package org.example.jiandan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S1742Test {

    @Test
    void countBalls() {
        S1742 s1742 = new S1742();
        Assertions.assertEquals(2, s1742.countBalls(1, 10));
        Assertions.assertEquals(2, s1742.countBalls(5, 15));
        Assertions.assertEquals(2, s1742.countBalls(19, 28));
        Assertions.assertEquals(1, s1742.countBalls(99999, 99999));
    }
}