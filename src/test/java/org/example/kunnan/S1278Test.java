package org.example.kunnan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S1278Test {

    @Test
    void palindromePartition() {
        S1278 s1278 = new S1278();
        Assertions.assertEquals(1, s1278.palindromePartition("abc", 2));
        Assertions.assertEquals(0, s1278.palindromePartition("aabbc", 3));
        Assertions.assertEquals(0, s1278.palindromePartition("leetcode", 8));
        Assertions.assertEquals(0, s1278.palindromePartition("faaglagedtwnejzpuarkgwgoefwra", 27));
        Assertions.assertEquals(20, s1278.palindromePartition("fyhowoxzyrincxivwarjuwxrwealesxsimsepjdqsstfggjnjhilvrwwytbgsqbpnwjaojfnmiqiqnyzijfmvekgakefjaxryyml", 32));
    }
}