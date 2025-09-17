package org.example.kunnan;

import java.util.LinkedList;
import java.util.List;

/**
 * 2197. 替换数组中的非互质数
 */
public class S2197 {

    public List<Integer> replaceNonCoprimes(int[] nums) {

        int tcp = 0;
        for (int i = 1; i < nums.length; i++) {
            int last = nums[tcp];
            if (getGCD(last, nums[i]) == 1) {
                nums[++tcp] = nums[i];
            } else {
                nums[tcp] = (int) getLCM(last, nums[i]);
            }

            for (int tcp1 = tcp; tcp1 >= 1; tcp1--) {
                int one = nums[tcp1];
                int two = nums[tcp1 - 1];
                if (getGCD(one, two) == 1) {
                    tcp = tcp1;
                    break;
                } else {
                    nums[tcp1 - 1] = (int) getLCM(one, two);
                    tcp = tcp1 - 1;
                }
            }

        }

        List<Integer> ans = new LinkedList<>();
        for (int i = 0; i <= tcp; i++) {
            ans.add(nums[i]);
        }
        return ans;

    }

    private long getLCM(int num1, int num2) {
        return (long) num1 * num2 / getGCD(num1, num2);
    }

    private int getGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
