package org.example.kunnan;

import org.example.TwoDIntArrayConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S2931Test {

    @ParameterizedTest
    @CsvFileSource(resources = "/S2931Test.csv", delimiterString = "|")
    void maxSpending(int expected, @ConvertWith(TwoDIntArrayConverter.class) int[][] actual) {
        S2931 s2931 = new S2931();
        assertEquals(expected, s2931.maxSpending(actual));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/S2931Test.csv", delimiterString = "|")
    void maxSpending2(int expected, @ConvertWith(TwoDIntArrayConverter.class) int[][] actual) {
        S2931 s2931 = new S2931();
        assertEquals(expected, s2931.maxSpending2(actual));
    }
}