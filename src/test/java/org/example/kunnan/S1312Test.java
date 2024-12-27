package org.example.kunnan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S1312Test {

    @Test
    void minInsertions() {
        S1312 s1312 = new S1312();
        Assertions.assertEquals(5, s1312.minInsertions("leetcode"));
    }
}