package org.example.kunnan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S887Test {

    @Test
    void superEggDrop() {
        S887 s887 = new S887();
        assertEquals(4, s887.superEggDrop(3, 14));
    }
}