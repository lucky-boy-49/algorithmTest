package org.example.kunnan;

import org.example.OneDStrArrayConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class S2125Test {

    @ParameterizedTest
    @CsvFileSource(resources = "S2125Test.csv", delimiterString = "|")
    void numberOfBeams(int e, @ConvertWith(OneDStrArrayConverter.class) String[] bank) {
        var s2125 = new S2125();
        assertEquals(e, s2125.numberOfBeams(bank));
    }
}