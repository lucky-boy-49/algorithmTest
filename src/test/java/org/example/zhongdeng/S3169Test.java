package org.example.zhongdeng;

import org.example.TwoDIntArrayConverter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class S3169Test {

    @ParameterizedTest
    @CsvFileSource(resources = "S3169Test.csv", delimiterString = "|")
    void countDays(int expected, int days,
                   @ConvertWith(TwoDIntArrayConverter.class) int[][] meetings) {
        S3169 s3169 = new S3169();
        assertEquals(expected, s3169.countDays(days, meetings));
    }
}