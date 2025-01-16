package org.example.jiandan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S3095Test {

    @Test
    void minimumSubarrayLength() {
        S3095 s3095 = new S3095();
        Assertions.assertEquals(1, s3095.minimumSubarrayLength(new int[]{1, 2, 3}, 2));
        Assertions.assertEquals(3, s3095.minimumSubarrayLength(new int[]{2, 1, 8}, 10));
        Assertions.assertEquals(1, s3095.minimumSubarrayLength(new int[]{1, 2}, 0));
        Assertions.assertEquals(2, s3095.minimumSubarrayLength(new int[]{16, 1, 2, 20, 32}, 45));
    }
}