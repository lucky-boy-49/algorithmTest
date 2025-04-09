package org.example.jiandan;

import org.example.OneDIntArrayConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

class S3375Test {

    @ParameterizedTest
    @CsvFileSource(resources = "S3375Test.csv", delimiterString = "|")
    void minOperations(int e,
                       @ConvertWith(OneDIntArrayConverter.class) int[] nums,
                       int k) {
        S3375 s3375 = new S3375();
        Assertions.assertEquals(e, s3375.minOperations(nums, k));
    }
}