package org.example.kunnan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S2197Test {

    @Test
    void replaceNonCoprimes() {
        int[] nums = new int[] {11,9,3,9,3,9,3,9,3,3,3,3,3,33,33,3,3,3,9,3,3,9,3,33,3,33,9,33,33,33,9,3,3,9,3,3,9,3,3,33,33,9,3,33,9,3,33,3,3,33,9,3,9,33,3,3,9,9,33,3,3,3485,85,3485,17,85,5,205,5,1025,85,85,205,205,25,5,425,85,5,425,5,1025,5,205,5,425,17,289};
        S2197 s2197 = new S2197();
        System.out.println(s2197.replaceNonCoprimes(nums));
    }
}