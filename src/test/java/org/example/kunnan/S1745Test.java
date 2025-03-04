package org.example.kunnan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S1745Test {

    @Test
    void checkPartitioning() {
        S1745 s1745 = new S1745();
        Assertions.assertTrue(s1745.checkPartitioning("abcbdd"));
        Assertions.assertFalse(s1745.checkPartitioning("bcbddxy"));
        Assertions.assertTrue(s1745.checkPartitioning("bbab"));
        Assertions.assertTrue(s1745.checkPartitioning("babcbabaababcbabaz"));
    }
}