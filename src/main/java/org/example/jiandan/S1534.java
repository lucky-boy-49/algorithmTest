package org.example.jiandan;

/**
 * 1534. 统计好三元组
 */
public class S1534 {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        if (arr.length < 3) return 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) > a) {
                    continue;
                }
                for (int k = j + 1; k < arr.length; k++) {
                    if (Math.abs(arr[j] - arr[k]) > b) {
                        continue;
                    }
                    if (Math.abs(arr[k] - arr[i]) <= c) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
