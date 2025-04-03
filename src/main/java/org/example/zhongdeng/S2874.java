package org.example.zhongdeng;

/**
 * 2874. 有序三元组中的最大值 II
 */
public class S2874 {
    public long maximumTripletValue(int[] nums) {
        long preMax = 0, differMax = 0, ans = 0;
        for (int num : nums) {
            ans = Math.max(ans, differMax * num);
            differMax = Math.max(differMax, preMax - num);
            preMax = Math.max(preMax, num);
        }
        return ans;
    }
}
