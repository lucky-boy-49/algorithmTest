package org.example.kunnan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S2197Test {

    @Test
    void replaceNonCoprimes() {
        int[] nums = new int[] {287,41,49,287,899,23,23,20677,5,825};
        S2197 s2197 = new S2197();
        System.out.println(s2197.replaceNonCoprimes(nums));
    }
}