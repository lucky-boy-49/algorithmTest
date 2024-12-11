package org.example.jiandan;

/**
 * 2717. 半有序排列
 */
public class S2717 {
    public int semiOrderedPermutation(int[] nums) {
        int n = nums.length, index1 = 0, index2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) index1 = i;
            if (nums[i] == n) index2 = i;
        }
        if (index1 < index2) {
            return index1 + (n - index2 - 1);
        } else {
            return index1 + (n - index2 - 1) - 1;
        }
    }
}
