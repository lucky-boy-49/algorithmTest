package org.example.jiandan;

import org.example.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S1290Test {

    @Test
    void getDecimalValue() {
        S1290 s1290 = new S1290();
        assertEquals(5, s1290.getDecimalValue(new ListNode(1, null)));;
    }
}