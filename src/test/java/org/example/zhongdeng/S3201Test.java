package org.example.zhongdeng;

import org.example.OneDIntArrayConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

class S3201Test {

    @ParameterizedTest
    @CsvFileSource(resources = "S3201Test.csv", delimiterString = "|")
    void maximumLength(int expected, @ConvertWith(OneDIntArrayConverter.class) int[] nums) {
        S3201 s3201 = new S3201();
        Assertions.assertEquals(expected, s3201.maximumLength(nums));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "S3201Test.csv", delimiterString = "|")
    void maximumLength2(int expected, @ConvertWith(OneDIntArrayConverter.class) int[] nums) {
        S3201 s3201 = new S3201();
        Assertions.assertEquals(expected, s3201.maximumLength2(nums));
    }
}