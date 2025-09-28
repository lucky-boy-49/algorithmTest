package org.example.jiandan;

import org.example.OneDIntArrayConverter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class S976Test {

    @ParameterizedTest
    @CsvFileSource(resources = "S976Test.csv", delimiterString = "|")
    void largestPerimeter(int e, @ConvertWith(OneDIntArrayConverter.class) int[] nums) {
        var s976 = new S976();
        assertEquals(e, s976.largestPerimeter(nums));
    }
}