package org.example.kunnan;

import org.example.OneDIntArrayConverter;
import org.example.TwoDIntArrayConverter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class S2322Test {

    @ParameterizedTest
    @CsvFileSource(resources = "S2322Test.csv", delimiterString = "|")
    void minimumScore(int e,
                      @ConvertWith(OneDIntArrayConverter.class) int[] nums,
                      @ConvertWith(TwoDIntArrayConverter.class) int[][] edges) {
        S2322 s2322 = new S2322();
        assertEquals(e, s2322.minimumScore(nums, edges));
    }
}