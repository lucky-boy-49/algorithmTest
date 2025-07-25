package org.example.jiandan;

/**
 * 3487. 删除后的最大子数组元素和
 */
public class S3487 {
    public int maxSum(int[] nums) {
        var flg = new int[201];
        var ans = 0;
        var minMaxNum  = Integer.MIN_VALUE;
        var fistFlg = true;
        for (int num : nums) {
            if (num < 0) {
                minMaxNum = Math.max(minMaxNum, num);
            } else {
                if (fistFlg) {
                    ans = num;
                    flg[num + 100] = 1;
                    fistFlg = false;
                } else {
                    if (flg[num + 100] == 0) {
                        ans += num;
                        flg[num + 100] = 1;
                    }
                }
            }
        }
        return !fistFlg ? ans : minMaxNum;
    }
}
