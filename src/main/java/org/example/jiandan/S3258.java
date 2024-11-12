package org.example.jiandan;

public class S3258 {
    public int countKConstraintSubstrings(String s, int k) {
        int left = 0, right = 1, count0 = s.charAt(left) == '0' ? 1 : 0,
                count1 = s.charAt(left) == '1' ? 1 : 0, res = s.length();
        while (left < s.length() - 1) {
                if (right < s.length() && s.charAt(right) == '0') {
                    count0++;
                } else if (right < s.length()){
                    count1++;
                }
                if ((count0 <= k || count1 <= k) && right < s.length()) {
                    res++;
                    right++;
                } else {
                    left++;
                    right = left + 1;
                    count0 = s.charAt(left) == '0' ? 1 : 0;
                    count1 = s.charAt(left) == '1' ? 1 : 0;
                }
        }
        return res;
    }
    public int countKConstraintSubstrings2(String s, int k) {
        int left = 0, count0 = 0, count1 = 0, count = 0;
        for (int right = 0; right < s.length(); right++) {
            // 更新窗口的数据
            if (s.charAt(right) == '0') {
                count0++;
            } else {
                count1++;
            }
            // 窗口内0和1都超过k，左指针右移
            while (count0 > k && count1 > k) {
                if (s.charAt(left++) == '0') {
                    count0--;
                } else {
                    count1--;
                }
            }
            // 计算当前窗口内的有效字符串个数
            count += (right - left + 1);
        }
        return count;
    }
}
