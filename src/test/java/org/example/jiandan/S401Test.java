package org.example.jiandan;

import org.junit.jupiter.api.Test;

class S401Test {

    @Test
    void readBinaryWatch() {
        S401 s401 = new S401();
        System.out.println(s401.readBinaryWatch(2));
    }
}