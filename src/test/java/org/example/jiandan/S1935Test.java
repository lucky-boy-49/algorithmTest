package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S1935Test {

    @Test
    void canBeTypedWords() {
        S1935 s1935 = new S1935();
        assertEquals(1, s1935.canBeTypedWords("hello world", "ad"));
        assertEquals(1, s1935.canBeTypedWords("leet code", "lt"));
        assertEquals(0, s1935.canBeTypedWords("leet code", "e"));
    }
}