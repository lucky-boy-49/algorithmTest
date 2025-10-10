package org.example.zhongdeng;

import org.example.OneDIntArrayConverter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class S3147Test {

    @ParameterizedTest
    @CsvFileSource(resources = "S3147Test.csv", delimiterString = "|")
    void maximumEnergy(int e, @ConvertWith(OneDIntArrayConverter.class) int[] energy, int k) {
        var s3147 = new S3147();
        assertEquals(e, s3147.maximumEnergy(energy, k));
    }
}