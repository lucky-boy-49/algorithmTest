package org.example.zhongdeng;

import org.example.OneDIntArrayConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class S3202Test {

    @ParameterizedTest
    @CsvFileSource(resources = "S3202Test.csv", delimiterString = "|")
    void maximumLength(int expected, @ConvertWith(OneDIntArrayConverter.class) int[] nums, int k) {
        S3202 s3202 = new S3202();
        assertEquals(expected, s3202.maximumLength(nums, k));
    }
}