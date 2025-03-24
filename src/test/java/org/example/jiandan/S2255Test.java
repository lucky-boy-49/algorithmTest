package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S2255Test {

    @Test
    void countPrefixes() {
        S2255 s2255 = new S2255();
        assertEquals(3, s2255.countPrefixes(new String[]{"a", "b", "c", "ab", "bc", "abc"}, "abc"));
    }
}