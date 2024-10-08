package org.example.kunnan;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class S4Test {

    @Test
    public void findMedianSortedArrays() {
        S4 s4 = new S4();
        assertEquals(3.5, s4.findMedianSortedArrays(new int[]{2, 3, 4}, new int[]{1, 3, 4, 5, 6}));
    }
}