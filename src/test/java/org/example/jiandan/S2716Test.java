package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S2716Test {

    @Test
    void minimizedStringLength() {
        S2716 s2716 = new S2716();
        assertEquals(3, s2716.minimizedStringLength("aaabc"));
        assertEquals(3, s2716.minimizedStringLength("cbbd"));
        assertEquals(2, s2716.minimizedStringLength("dddaaa"));
    }
}