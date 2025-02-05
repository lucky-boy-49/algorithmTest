package org.example.zhongdeng;

import org.junit.jupiter.api.Test;

import java.util.List;

class S90Test {

    @Test
    void subsetsWithDup() {
        S90 s90 = new S90();
        List<List<Integer>> res = s90.subsetsWithDup(new int[]{1, 2, 2});
        System.out.println(res);
    }
}