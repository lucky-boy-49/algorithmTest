package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S1472Test {

    @Test
    void test() {
        S1472 s1472 = new S1472("leetcode.com");
        s1472.visit("google.com");
        s1472.visit("facebook.com");
        s1472.visit("youtube.com");
        Assertions.assertEquals("facebook.com", s1472.back(1));
        Assertions.assertEquals("google.com", s1472.back(1));
        Assertions.assertEquals("facebook.com", s1472.forward(1));
        s1472.visit("linkedin.com");
        Assertions.assertEquals("linkedin.com", s1472.forward(2));
        Assertions.assertEquals("google.com", s1472.back(2));
        Assertions.assertEquals("leetcode.com", s1472.back(7));
    }

}