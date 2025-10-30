package org.example.kunnan;

import org.example.OneDIntArrayConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S1526Test {

    @ParameterizedTest
    @CsvFileSource(resources = "S1526Test.csv", delimiterString = "|")
    void minNumberOperations(int e, @ConvertWith(OneDIntArrayConverter.class) int[] target) {
        var s1526 = new S1526();
        assertEquals(e, s1526.minNumberOperations(target));
    }
}