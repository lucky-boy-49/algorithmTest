package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S729Test {

    @Test
    void book() {
        S729 s729 = new S729();
        Assertions.assertTrue(s729.book(47, 50));
        Assertions.assertTrue(s729.book(33, 41));
        Assertions.assertFalse(s729.book(39, 45));
        Assertions.assertFalse(s729.book(33, 42));
        Assertions.assertTrue(s729.book(25, 32));
        Assertions.assertFalse(s729.book(26, 35));
        Assertions.assertTrue(s729.book(19, 25));
        Assertions.assertTrue(s729.book(3, 8));
        Assertions.assertTrue(s729.book(8, 13));
        Assertions.assertFalse(s729.book(18, 27));
    }
}