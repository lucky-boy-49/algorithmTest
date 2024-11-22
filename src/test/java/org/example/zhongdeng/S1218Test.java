package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S1218Test {

    @Test
    void longestSubsequence() {
        S1218 s1218 = new S1218();
        assertEquals(4, s1218.longestSubsequence(new int[]{1, 2, 3, 4}, 1));
        assertEquals(1, s1218.longestSubsequence(new int[]{1, 3, 5, 7}, 1));
        assertEquals(4, s1218.longestSubsequence(new int[]{1, 5, 7, 8, 5, 3, 4, 2, 1}, -2));
        assertEquals(2, s1218.longestSubsequence(new int[]{3, 4, -3, -2, -4}, -5));
    }
}