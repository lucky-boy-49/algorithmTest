package org.example.zhongdeng;

import org.example.OneDIntArrayConverter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class S2221Test {

    @ParameterizedTest
    @CsvFileSource(resources = "S2221Test.csv", delimiterString = "|")
    void triangularSum(int e, @ConvertWith(OneDIntArrayConverter.class) int[] nums) {
        var s2221 = new S2221();
        assertEquals(e, s2221.triangularSum(nums));
    }
}