package org.example.zhongdeng;

import org.example.OneDIntArrayConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S1695Test {

    @ParameterizedTest
    @CsvFileSource(resources = "S1695Test.csv", delimiterString = "|")
    void maximumUniqueSubarray(int expected, @ConvertWith(OneDIntArrayConverter.class) int[] nums) {
        S1695 solution = new S1695();
        int result = solution.maximumUniqueSubarray(nums);
        assertEquals(expected, result);
    }
}