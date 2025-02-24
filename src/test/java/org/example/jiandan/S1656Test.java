package org.example.jiandan;

import org.junit.jupiter.api.Test;

class S1656Test {

    @Test
    void test() {
        S1656 s1656 = new S1656(5);
        System.out.println(s1656.insert(3, "ccccc"));
        System.out.println(s1656.insert(1, "aaaaa"));
        System.out.println(s1656.insert(2, "bbbbb"));
        System.out.println(s1656.insert(5, "eeeee"));
        System.out.println(s1656.insert(4, "ddddd"));
    }

}