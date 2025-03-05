package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S1328Test {

    @Test
    void breakPalindrome() {
        S1328 s1328 = new S1328();
        assertEquals("aaccba", s1328.breakPalindrome("abccba"));
        assertEquals("ab", s1328.breakPalindrome("aa"));
        assertEquals("abb", s1328.breakPalindrome("aba"));
    }
}