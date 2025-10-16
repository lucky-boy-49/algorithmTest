package org.example.zhongdeng;

import org.example.OneDIntArrayConverter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S2598Test {

    private static S2598 s2598;

    @BeforeAll
    public static void init() {
        s2598 = new S2598();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "S2598Test.csv", delimiterString = "|")
    void findSmallestInteger(int e, @ConvertWith(OneDIntArrayConverter.class) int[] nums, int value) {
        assertEquals(e, s2598.findSmallestInteger(nums, value));
    }

}