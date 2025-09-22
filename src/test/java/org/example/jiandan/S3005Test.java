package org.example.jiandan;

import org.example.OneDIntArrayConverter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class S3005Test {

    @ParameterizedTest()
    @CsvFileSource(resources = "S3005Test.csv", delimiterString = "|")
    void maxFrequencyElements(int e, @ConvertWith(OneDIntArrayConverter.class) int[] nums) {
        S3005 s3005 = new S3005();
        assertEquals(e, s3005.maxFrequencyElements(nums));
    }
}