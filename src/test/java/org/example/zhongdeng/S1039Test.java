package org.example.zhongdeng;

import org.example.OneDIntArrayConverter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class S1039Test {

    @ParameterizedTest
    @CsvFileSource(resources = "S1039Test.csv", delimiterString = "|")
    void minScoreTriangulation(int e, @ConvertWith(OneDIntArrayConverter.class) int[] nums) {
        var s1039 = new S1039();
        assertEquals(e, s1039.minScoreTriangulation(nums));
    }
}