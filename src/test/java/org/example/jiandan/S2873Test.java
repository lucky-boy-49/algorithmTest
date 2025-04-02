package org.example.jiandan;

import org.example.OneDIntArrayConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

class S2873Test {

    @ParameterizedTest
    @CsvFileSource(resources = "org/example/jiandan/S2873Test.csv", delimiterString = "|")
    void maximumTripletValue(int expected,
                             @ConvertWith(OneDIntArrayConverter.class) int[] nums) {
        Assertions.assertEquals(expected, new S2873().maximumTripletValue(nums));
    }
}