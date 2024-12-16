package org.example.kunnan;

import org.example.OneDIntArrayConverter;
import org.example.TwoDIntArrayConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class S1847Test {

    @ParameterizedTest
    @CsvFileSource(resources = "/S1847Test.csv", delimiterString = "|")
    void closestRoom(@ConvertWith(OneDIntArrayConverter.class) int[] expected,
                     @ConvertWith(TwoDIntArrayConverter.class) int[][] rooms,
                     @ConvertWith(TwoDIntArrayConverter.class) int[][] queries) {
        S1847 s1847 = new S1847();
        assertArrayEquals(expected, s1847.closestRoom(rooms, queries));
    }
}