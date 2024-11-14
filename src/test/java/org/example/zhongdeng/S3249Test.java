package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S3249Test {

    @Test
    void countGoodNodes() {
        S3249 s3249 = new S3249();
        // assertEquals(7, s3249.countGoodNodes(new int[][]{{0,1},{0,2},{1,3},{1,4},{2,5},{2,6}}));
        assertEquals(3, s3249.countGoodNodes(new int[][]{{1,0},{3,0},{2,3}}));
    }
}