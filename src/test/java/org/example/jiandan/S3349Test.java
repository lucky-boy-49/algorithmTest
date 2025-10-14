package org.example.jiandan;

import org.example.IntListConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.List;

class S3349Test {

    @ParameterizedTest
    @CsvFileSource(resources = "S3349Test.csv", delimiterString = "|")
    void hasIncreasingSubarrays(boolean e, @ConvertWith(IntListConverter.class) List<Integer> nums, int k) {
        var s3349 = new S3349();
        Assertions.assertEquals(e, s3349.hasIncreasingSubarrays(nums, k));
    }
}