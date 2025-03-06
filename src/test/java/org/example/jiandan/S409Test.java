package org.example.jiandan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S409Test {

    @Test
    void longestPalindrome() {
        S409 s409 = new S409();
        Assertions.assertEquals(7, s409.longestPalindrome("abccccdd"));
        Assertions.assertEquals(1, s409.longestPalindrome("a"));
        Assertions.assertEquals(7, s409.longestPalindrome("aaaAaaaa"));
    }
}