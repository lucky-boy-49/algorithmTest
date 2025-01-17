package org.example.zhongdeng;

import org.example.OneDIntArrayConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

class S3097Test {

    @ParameterizedTest
    @CsvFileSource(resources = "/S3097Test.csv", delimiterString = "|")
    void minimumSubarrayLength(@ConvertWith(OneDIntArrayConverter.class) int[] nums, int k, int ans) {
        S3097 s3097 = new S3097();
        Assertions.assertEquals(ans, s3097.minimumSubarrayLength(nums, k));
    }

    @Test
    void minimumSubarrayLength() {
        S3097 s3097 = new S3097();
        Assertions.assertEquals(-1, s3097.minimumSubarrayLength(new int[]{2, 1, 9, 12}, 21));
    }
}