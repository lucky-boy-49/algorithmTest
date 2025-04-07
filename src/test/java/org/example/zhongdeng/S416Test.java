package org.example.zhongdeng;

import org.example.OneDIntArrayConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

class S416Test {

    @ParameterizedTest
    @CsvFileSource(resources = "S416Test.csv", delimiterString = "|")
    void canPartition(boolean e, @ConvertWith(OneDIntArrayConverter.class) int[] nums) {
        S416 s416 = new S416();
        Assertions.assertEquals(e, s416.canPartition(nums));
    }
}