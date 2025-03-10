package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S2269Test {

    @Test
    void divisorSubstrings() {
        S2269 s2269 = new S2269();
        assertEquals(2, s2269.divisorSubstrings(240, 2));
        assertEquals(2, s2269.divisorSubstrings(430043, 2));
    }
}