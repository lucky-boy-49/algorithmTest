package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class S3408Test {
    @Test
    void test() {
        List<List<Integer>> lists = List.of(List.of(1, 101, 10),
                List.of(2,102,20),List.of(3,103,15));
        S3408 s3408 = new S3408(lists);
        s3408.add(4,104,5);
        s3408.edit(102,8);
        assertEquals(3, s3408.execTop());
        s3408.rmv(101);
        s3408.add(5,105,15);
        assertEquals(5, s3408.execTop());
    }
}