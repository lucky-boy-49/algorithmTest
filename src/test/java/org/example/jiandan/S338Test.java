package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class S338Test {

    @Test
    void countBits() {
        S338 s338 = new S338();
        assertArrayEquals(new int[]{0, 1, 1}, s338.countBits(2));
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, s338.countBits(5));
    }
}