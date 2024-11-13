package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S516Test {

    @Test
    void longestPalindromeSubseq() {
        S516 s516 = new S516();
        assertEquals(4, s516.longestPalindromeSubseq("bbbab"));
    }
}