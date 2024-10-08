package org.example.jiandan;

public class S2535 {
    public int differenceOfSum(int[] nums) {
        int sum = 0, sum2 = 0;
        for (int num : nums) {
            sum += num;
            while (num > 0) {
                sum2 += num % 10;
                num /= 10;
            }
        }
        return Math.abs(sum - sum2);
    }
}
