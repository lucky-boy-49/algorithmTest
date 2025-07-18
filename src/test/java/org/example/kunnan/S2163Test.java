package org.example.kunnan;

import org.example.OneDIntArrayConverter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class S2163Test {

    @ParameterizedTest
    @CsvFileSource(resources = "S2163Test.csv", delimiterString = "|")
    void minimumDifference(int expected, @ConvertWith(OneDIntArrayConverter.class) int[] nums) {
        S2163 s2163 = new S2163();
        assertEquals(expected, s2163.minimumDifference(nums));
    }
}