package org.example.zhongdeng;

/**
 * 2266. 统计打字方案数
 */
public class S2266 {
    public int countTexts(String pressedKeys) {
        int[] jp = new int[]{0, 0, 3, 3, 3, 3, 3, 4, 3, 4};
        int len = pressedKeys.length();
        char[] chars = pressedKeys.toCharArray();
        int[] dp = new int[len + 1];
        dp[0] = 1;
        int size = 0;
        char indexChar = 'a';
        for (int i = 0; i < len; i++) {
            int c = chars[i] - '0';
            if (chars[i] == indexChar) {
                size = size + 1 > jp[c] ? jp[c] : ++size;
            } else {
                size = 1;
                indexChar = chars[i];
            }
            for (int j = 0; j < size; j++) {
                dp[i + 1] = (dp[i + 1] + dp[i - j]) % 1000000007;
            }
        }
        return dp[len];
    }
}
