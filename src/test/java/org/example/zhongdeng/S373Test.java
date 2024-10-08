package org.example.zhongdeng;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class S373Test {

    @Test
    public void kSmallestPairs() {
        S373 s373 = new S373();
        int[] nums1 = new int[] {1,2,4,5,6};
        int[] nums2 = new int[] {3,5,7,9};
        List<List<Integer>> lists = s373.kSmallestPairs(nums1, nums2, 3);
        lists.forEach(System.out::println);
    }

}