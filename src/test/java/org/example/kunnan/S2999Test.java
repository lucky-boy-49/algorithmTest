package org.example.kunnan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class S2999Test {

    @ParameterizedTest
    @CsvFileSource(resources = "S2999Test.csv", delimiterString = "|")
    void numberOfPowerfulInt(long e, long start, long finish, int limit, String s) {
        S2999 s2999 = new S2999();
        Assertions.assertEquals(e, s2999.numberOfPowerfulInt(start, finish, limit, s));
    }
}