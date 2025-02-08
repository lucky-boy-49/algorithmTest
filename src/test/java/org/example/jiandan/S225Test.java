package org.example.jiandan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S225Test {

    @Test
    void test() {
        S225 s225 = new S225();
        s225.push(1);
        s225.push(2);
        Assertions.assertEquals(2, s225.top());
        Assertions.assertEquals(2, s225.pop());
        Assertions.assertFalse(s225.empty());
    }

}