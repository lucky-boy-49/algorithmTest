package org.example.zhongdeng;

import org.example.TwoDIntArrayConverter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class S1353Test {

    @ParameterizedTest
    @CsvFileSource(resources = "S1353Test.csv", delimiterString = "|")
    void maxEvents(int expected, @ConvertWith(TwoDIntArrayConverter.class) int[][] events) {
        S1353 s1353 = new S1353();
        assertEquals(expected, s1353.maxEvents(events));
    }
}