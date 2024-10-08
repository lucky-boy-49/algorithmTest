package org.example.zhongdeng;

public class S153 {
    public int findMin(int[] nums) {
        int len = nums.length;
        if (nums[0] <= nums[len - 1]) {
            return nums[0];
        }
        int l = 0, r = len - 1;
        int mid = 0;
        while (l < r) {
            mid = l + (r - l) / 2;
            if (nums[mid] > nums[len - 1]) {
                l = mid + 1;
            } else if (nums[mid] < nums[mid - 1]) {
                return nums[mid];
            } else if (nums[mid] > nums[mid - 1]) {
                r = mid - 1;
            }
        }
        return nums[l];
    }
}
