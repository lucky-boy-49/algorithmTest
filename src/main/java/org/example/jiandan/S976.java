package org.example.jiandan;

/**
 * 976. 三角形的最大周长
 */
public class S976 {
    public int largestPerimeter(int[] nums) {
        int n = nums.length;
        // 排序，最大值放在最前面，最大值天然满足三个条件中的两个条件
        for(int i = 0; i < n ; i++){
            for(int j = i + 1; j < n; j++){
                if(nums[i] < nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            // 如果已经找到三个最大值，判断第三个条件是否成立
            if(i>=2 && nums[i] + nums[i - 1] > nums[i - 2]){
                return nums[i] + nums[i - 1]+nums[i - 2];
            }
        }
        return 0;
    }

}
