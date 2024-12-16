package org.example.zhongdeng;

import org.example.OneDIntArrayConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S1035Test {

    @ParameterizedTest
    @CsvFileSource(resources = "/S1035Test.csv", delimiterString = "|")
    void maxUncrossedLines(int expected,
                           @ConvertWith(OneDIntArrayConverter.class) int[] nums1,
                           @ConvertWith(OneDIntArrayConverter.class) int[] nums2) {
        S1035 s1035 = new S1035();
        assertEquals(expected, s1035.maxUncrossedLines(nums1, nums2));
    }
}