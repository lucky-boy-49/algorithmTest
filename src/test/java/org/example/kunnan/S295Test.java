package org.example.kunnan;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class S295Test {

    @Test
    public void test() {
        S295 s295 = new S295();
        s295.addNum(1);
        s295.addNum(2);
        System.out.println(s295.findMedian());
        s295.addNum(3);
        System.out.println(s295.findMedian());
    }

}