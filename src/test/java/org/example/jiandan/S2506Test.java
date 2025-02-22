package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S2506Test {

    @Test
    void similarPairs() {
        S2506 s2506 = new S2506();
        assertEquals(2, s2506.similarPairs(new String[]{"aba", "aabb", "abcd", "bac", "aabc"}));
        assertEquals(3, s2506.similarPairs(new String[]{"aabb", "ab", "ba"}));
        assertEquals(0, s2506.similarPairs(new String[]{"nba", "cba", "dba"}));
    }
}