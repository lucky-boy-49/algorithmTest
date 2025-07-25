package org.example.jiandan;

import org.example.OneDIntArrayConverter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class S3487Test {

    @ParameterizedTest
    @CsvFileSource(resources = "S3487Test.csv", delimiterString = "|")
    void maxSum(int e, @ConvertWith(OneDIntArrayConverter.class) int[] nums) {
        S3487 s3487 = new S3487();
        assertEquals(e, s3487.maxSum(nums));
    }
}