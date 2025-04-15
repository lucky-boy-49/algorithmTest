package org.example.kunnan;

import org.example.OneDIntArrayConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

class S2179Test {

    @ParameterizedTest
    @CsvFileSource(resources = "S2179Test.csv", delimiterString = " ")
    void goodTriplets(int e,
                      @ConvertWith(OneDIntArrayConverter.class) int[] nums1,
                      @ConvertWith(OneDIntArrayConverter.class) int[] nums2
    ) {
        S2179 s2179 = new S2179();
        Assertions.assertEquals(e, s2179.goodTriplets(nums1, nums2));
    }
}