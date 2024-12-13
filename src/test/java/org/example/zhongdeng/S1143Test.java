package org.example.zhongdeng;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S1143Test {

    @ParameterizedTest
    @CsvSource({"3, abcde, ace", "3, abc, abc", "0, abc, def", "2, ezupkr, ubmrapg"})
    void longestCommonSubsequence(int expected, String text1, String text2) {
        S1143 s1143 = new S1143();
        assertEquals(expected, s1143.longestCommonSubsequence(text1, text2));
    }
}