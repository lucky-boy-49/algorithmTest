package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S673Test {

    @Test
    void findNumberOfLIS() {
        S673 s673 = new S673();
        assertEquals(2, s673.findNumberOfLIS(new int[] {1,3,5,4,7}));
        assertEquals(5, s673.findNumberOfLIS(new int[] {2,2,2,2,2}));
        assertEquals(2, s673.findNumberOfLIS(new int[] {2,1}));
        assertEquals(2, s673.findNumberOfLIS(new int[] {1,3,2}));
        assertEquals(1, s673.findNumberOfLIS(new int[] {3,1,2}));
    }
}