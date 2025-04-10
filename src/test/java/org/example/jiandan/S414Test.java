package org.example.jiandan;

import org.example.OneDIntArrayConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

class S414Test {

    @ParameterizedTest
    @CsvFileSource(resources = "S414Test.csv", delimiterString = "|")
    void thirdMax(int e, @ConvertWith(OneDIntArrayConverter.class) int[] nums) {
        S414 s414 = new S414();
        Assertions.assertEquals(e, s414.thirdMax(nums));
    }
}