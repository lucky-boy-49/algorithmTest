package org.example.zhongdeng;

public class S633 {
    public boolean judgeSquareSum(int c) {
        int right = (int) Math.sqrt(c);
        int left = 0;
        while (left <= right) {
            int sum = (int) (Math.pow(left, 2) + Math.pow(right, 2));
            if (sum == c) {
                return true;
            } else if (sum < c) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}
