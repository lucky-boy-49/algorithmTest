package org.example.zhongdeng;

import org.example.TwoDIntArrayConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

class S2140Test {

    @ParameterizedTest
    @CsvFileSource(resources = "/S2140Test.csv", delimiterString = "|")
    void mostPoints(int expected,
                    @ConvertWith(TwoDIntArrayConverter.class) int[][] questions) {
        S2140 s2140 = new S2140();
        Assertions.assertEquals(expected, s2140.mostPoints(questions));
    }
}