package org.example.zhongdeng;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class S3372Test {

    @Test
    void maxTargetNodes() {
        int[][] edges1 = {{0, 1}, {0, 2}, {2, 3}, {2, 4}};
        int[][] edges2 = {{0, 1}, {0, 2}, {0, 3}, {2, 7}, {1, 4}, {4, 5}, {4, 6}};
        S3372 s3372 = new S3372();
        Assertions.assertArrayEquals(new int[]{9, 7, 9, 8, 8}, s3372.maxTargetNodes(edges1, edges2, 2));
    }

    @Test
    void maxTargetNodes2() {
        int[][] edges1 = {{0, 1}, {0, 2}, {0, 3}, {0, 4}};
        int[][] edges2 = {{0, 1}, {1, 2}, {2, 3}};
        S3372 s3372 = new S3372();
        Assertions.assertArrayEquals(new int[]{6, 3, 3, 3, 3}, s3372.maxTargetNodes(edges1, edges2, 1));
    }

    @Test
    void maxTargetNodes3() {
        int[][] edges1 = {{0, 1}};
        int[][] edges2 = {{0, 1}};
        S3372 s3372 = new S3372();
        Assertions.assertArrayEquals(new int[]{1, 1}, s3372.maxTargetNodes(edges1, edges2, 0));
    }
}