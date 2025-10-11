package org.example.zhongdeng;

import org.example.OneDIntArrayConverter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class S3186Test {

    @ParameterizedTest
    @CsvFileSource(resources = "S3186Test.csv", delimiterString = "|")
    void maximumTotalDamage(int e, @ConvertWith(OneDIntArrayConverter.class) int[] power) {
        var s3186 = new S3186();
        assertEquals(e, s3186.maximumTotalDamage(power));
        assertEquals(e, s3186.maximumTotalDamage2(power));
    }
}