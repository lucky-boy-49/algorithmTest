package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S268Test {

    @Test
    void missingNumber() {
        S268 s268 = new S268();
        assertEquals(2, s268.missingNumber(new int[]{3, 0, 1}));
        assertEquals(2, s268.missingNumber(new int[]{0, 1}));
        assertEquals(8, s268.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }
}