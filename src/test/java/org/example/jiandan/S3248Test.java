package org.example.jiandan;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class S3248Test {

    @Test
    void finalPositionOfSnake() {
        S3248 s3248 = new S3248();
        assertEquals(3, s3248.finalPositionOfSnake(2, Arrays.asList("RIGHT","DOWN")));
        assertEquals(1, s3248.finalPositionOfSnake(3, Arrays.asList("DOWN","RIGHT","UP")));
        assertEquals(2, s3248.finalPositionOfSnake(2, List.of("DOWN")));
    }
}