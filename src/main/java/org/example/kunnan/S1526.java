package org.example.kunnan;

/**
 * 1526. 形成目标数组的子数组最少增加次数
 */
public class S1526 {
    public int minNumberOperations(int[] target) {
        var ans = 0;
        var pre = 0;
        for (int num : target) {
            if (num > pre) ans += num - pre;
            pre = num;
        }
        return ans;
    }
}
