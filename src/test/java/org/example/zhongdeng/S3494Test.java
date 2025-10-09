package org.example.zhongdeng;

import org.example.OneDIntArrayConverter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class S3494Test {

    @ParameterizedTest
    @CsvFileSource(resources = "S3494Test.csv", delimiterString = "|")
    void minTime(int e, @ConvertWith(OneDIntArrayConverter.class) int[] skill,
                 @ConvertWith(OneDIntArrayConverter.class) int[] mana) {
        var s3494 = new S3494();
        assertEquals(e, s3494.minTime(skill, mana));
    }
}