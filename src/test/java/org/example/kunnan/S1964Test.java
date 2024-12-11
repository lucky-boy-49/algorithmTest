package org.example.kunnan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class S1964Test {

    @Test
    void longestObstacleCourseAtEachPosition() {
        S1964 s1964 = new S1964();
        assertArrayEquals(new int[]{1, 2, 3, 3},
                s1964.longestObstacleCourseAtEachPosition(new int[]{1, 2, 3, 2}));
        assertArrayEquals(new int[]{1, 2, 1},
                s1964.longestObstacleCourseAtEachPosition(new int[]{2, 2, 1}));
        assertArrayEquals(new int[]{1, 1, 2, 3, 2, 2},
                s1964.longestObstacleCourseAtEachPosition(new int[]{3, 1, 5, 6, 4, 2}));
    }
}