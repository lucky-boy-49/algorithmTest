package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S5Test {

    @Test
    void longestPalindrome2() {
        S5 s5 = new S5();
        assertEquals("bab", s5.longestPalindrome2("babad"));
    }
}