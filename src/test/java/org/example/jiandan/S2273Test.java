package org.example.jiandan;

import org.example.OneDStrArrayConverter;
import org.example.StrListConverter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;
import static org.junit.jupiter.api.Assertions.assertTrue;

class S2273Test {

    @Test
    void isAnagrams() {
        var s2273 = new S2273();
        assertTrue(s2273.isAnagrams("anagram", "nagaram"));
        assertFalse(s2273.isAnagrams("rat", "car"));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "S2273Test.csv", delimiterString = "|")
    void removeAnagrams(@ConvertWith(StrListConverter.class) List<String> e, @ConvertWith(OneDStrArrayConverter.class) String[] words) {
        var s2273 = new S2273();
        assertLinesMatch(e, s2273.removeAnagrams(words));
    }
}