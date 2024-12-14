package org.example.kunnan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class S3622Test {

    @Test
    void getFinalState() {
        S3622 s3622 = new S3622();
        assertArrayEquals(new int[]{8, 4, 6, 5, 6},
                s3622.getFinalState(new int[]{2, 1, 3, 5, 6}, 5, 2));
        assertArrayEquals(new int[]{198168519},
                s3622.getFinalState(new int[]{161209470}, 56851412, 39846));
    }
}