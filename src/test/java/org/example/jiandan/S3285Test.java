package org.example.jiandan;

import org.junit.jupiter.api.Test;

class S3285Test {

    @Test
    void stableMountains() {
        S3285 s3285 = new S3285();
        System.out.println(s3285.stableMountains(new int[]{1, 2, 3, 4, 5}, 2));
    }
}