package org.example.zhongdeng;

import org.junit.Test;

import static org.junit.Assert.*;

public class S153Test {

    @Test
    public void findMin() {
        S153 s153 = new S153();
        assertEquals(0, s153.findMin(new int[] {4,5,6,7,0,1,2}));
    }
}