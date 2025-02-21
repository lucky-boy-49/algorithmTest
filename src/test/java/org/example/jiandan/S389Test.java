package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S389Test {

    @Test
    void findTheDifference() {
        S389 s389 = new S389();
        assertEquals('e', s389.findTheDifference("abcd", "abcde"));
    }
}