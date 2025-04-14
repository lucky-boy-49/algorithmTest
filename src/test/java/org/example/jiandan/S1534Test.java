package org.example.jiandan;

import org.example.OneDIntArrayConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

class S1534Test {

    @ParameterizedTest
    @CsvFileSource(resources = "S1534Test.csv", delimiterString = " ")
    void countGoodTriplets(@ConvertWith(OneDIntArrayConverter.class) int[] arr,
                           int a, int b, int c, int ex) {
        S1534 s1534 = new S1534();
        Assertions.assertEquals(ex, s1534.countGoodTriplets(arr, a, b, c));
    }
}