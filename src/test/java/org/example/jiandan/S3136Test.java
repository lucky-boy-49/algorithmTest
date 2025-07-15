package org.example.jiandan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S3136Test {

    @Test
    void isValid() {
        S3136 s3136 = new S3136();
        assertTrue(s3136.isValid("234Adas"));
        assertFalse(s3136.isValid("b3"));
        assertFalse(s3136.isValid("a3$e"));
        assertFalse(s3136.isValid("UuE6"));
    }
}