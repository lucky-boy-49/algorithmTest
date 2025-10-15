package org.example.zhongdeng;

import org.example.IntListConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.List;

class S3350Test {

    @ParameterizedTest
    @CsvFileSource(resources = "S3350Test.csv", delimiterString = "|")
    void maxIncreasingSubarrays(int e, @ConvertWith(IntListConverter.class) List<Integer> nums) {
        var s3350 = new S3350();
        Assertions.assertEquals(e, s3350.maxIncreasingSubarrays(nums));
    }
}