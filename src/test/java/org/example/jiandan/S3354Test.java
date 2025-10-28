package org.example.jiandan;

import org.example.OneDIntArrayConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S3354Test {

    @ParameterizedTest
    @CsvFileSource(resources = "S3354Test.csv", delimiterString = "|")
    void countValidSelections(int e, @ConvertWith(OneDIntArrayConverter.class) int[] nums) {
        var s3354 = new S3354();
        assertEquals(e, s3354.countValidSelections(nums));
    }
}