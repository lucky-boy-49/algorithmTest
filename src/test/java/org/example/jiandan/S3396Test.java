package org.example.jiandan;

import org.example.OneDIntArrayConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

class S3396Test {

    @ParameterizedTest
    @CsvFileSource(resources = "S3396Test.csv", delimiterString = "|")
    void minimumOperations(int e, @ConvertWith(OneDIntArrayConverter.class) int[] nums) {
        S3396 s3396 = new S3396();
        Assertions.assertEquals(e, s3396.minimumOperations(nums));
    }
}