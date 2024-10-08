package org.example.zhongdeng;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class S215Test {

    @Test
    public void findKthLargest() {
        S215 s215 = new S215();
        assertEquals(5, s215.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }
}