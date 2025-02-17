package org.example.jiandan;

/**
 * 1287. 有序数组中出现次数超过25%的元素
 */
public class S1287 {
    public int findSpecialInteger(int[] arr) {
        double v = Math.ceil(arr.length * 0.25);
        int sum = 1;
        int i;
        for (i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                sum++;
                if (sum > v) {
                    return arr[i];
                }
            } else {
                sum = 1;
            }
        }
        return arr[i - 1];
    }
}
