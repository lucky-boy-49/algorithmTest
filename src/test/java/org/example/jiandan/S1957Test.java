package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S1957Test {

    @Test
    void makeFancyString() {
        S1957 s1957 = new S1957();
        assertEquals("leetcode", s1957.makeFancyString("leeetcode"));
        assertEquals("aabaa", s1957.makeFancyString("aaabaaaa"));
        assertEquals("aab", s1957.makeFancyString("aab"));
    }
}