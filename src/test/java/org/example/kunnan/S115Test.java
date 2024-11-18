package org.example.kunnan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S115Test {

    @Test
    void numDistinct() {
        S115 s115 = new S115();
        assertEquals(3, s115.numDistinct("rabbbit", "rabbit"));
        assertEquals(5, s115.numDistinct("babgbag", "bag"));
        assertEquals(4, s115.numDistinct("aabb", "ab"));
    }
}