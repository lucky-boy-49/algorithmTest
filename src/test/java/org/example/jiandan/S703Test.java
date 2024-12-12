package org.example.jiandan;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class S703Test {
    static S703 s703;

    @BeforeAll
    static void beforeAll() {
        s703 = new S703(3, new int[]{4, 5, 8, 2});
    }

    @ParameterizedTest
    @CsvSource({"4, 3", "5, 5", "5, 10", "8, 9", "8, 4"})
    void test(int expected, int actual) {
        assertEquals(expected, s703.add(actual));
    }

}