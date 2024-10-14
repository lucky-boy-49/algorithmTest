package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class S139Test {

    @Test
    void wordBreak() {
        S139 s139 = new S139();
        assertTrue(s139.wordBreak("applepenapple", Arrays.asList("apple", "pen")));
    }
}