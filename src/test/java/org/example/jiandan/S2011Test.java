package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S2011Test {

    @Test
    void finalValueAfterOperations() {
        var s2011 = new S2011();
        assertEquals(1, s2011.finalValueAfterOperations(new String[]{"--X","X++","X++"}));
    }
}