package org.example.jiandan;

/**
 * 3340. 检查平衡字符串
 */
public class S3340 {
    public boolean isBalanced(String num) {
        long res = 0;
        boolean flag = true;
        char[] chars = num.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (flag) {
                res += chars[i] - '1' + 1;
                flag = false;
            } else {
                res -= chars[i] - '1' + 1;
                flag = true;
            }
        }
        return res == 0;
    }
}
