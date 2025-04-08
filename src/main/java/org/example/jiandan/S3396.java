package org.example.jiandan;

/**
 * 3396. 使数组元素互不相同所需的最少操作次数
 */
public class S3396 {
    public int minimumOperations(int[] nums) {
        int[] flag = new int[1001];
        int i;
        for (i = nums.length - 1; i >= 0; i--) {
            if (flag[nums[i]] == 0) {
                flag[nums[i]] = 1;
            } else {
                break;
            }
        }
        return (int) Math.ceil((double) (i + 1) / 3);
    }
}
