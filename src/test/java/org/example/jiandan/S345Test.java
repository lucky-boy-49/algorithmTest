package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S345Test {

    @Test
    void reverseVowels() {
        S345 s345 = new S345();
        assertEquals("AceCreIm", s345.reverseVowels("IceCreAm"));
        assertEquals("leotcede", s345.reverseVowels("leetcode"));
    }
}