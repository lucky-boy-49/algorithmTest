package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S3175Test {

    @Test
    void findWinningPlayer() {
        S3175 s3175 = new S3175();
        assertEquals(1, s3175.findWinningPlayer(new int[] {4,18,17,20,15,12,8,5}, 1));
    }
}