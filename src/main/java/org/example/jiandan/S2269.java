package org.example.jiandan;

/**
 * 2269. 找到一个数字的 K 美丽值
 */
public class S2269 {
    public int divisorSubstrings(int num, int k) {
        int res = 0;
        String value = String.valueOf(num);
        for (int i = k; i <= value.length(); i++) {
            String substring = value.substring(i - k, i);
            int parseInt = Integer.parseInt(substring);
            if (parseInt > 0 && num % parseInt == 0) {
                res++;
            }
        }
        return res;
    }
}
