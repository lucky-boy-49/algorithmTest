package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S45Test {

    @Test
    void jump() {
        int[] nums = {2, 3, 0, 1, 4};
        S45 s45 = new S45();
        assertEquals(2, s45.jump(nums));
    }
}