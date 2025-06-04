package org.example.zhongdeng;

/**
 * 3403. 从盒子中找出字典序最大的字符串 I
 */
public class S3403 {
    public String answerString(String word, int numFriends) {
        if (numFriends == 1) {
            return word;
        }
        int n = word.length();
        String ans = "";
        for (int i = 0; i < n; i++) {
            String sub = word.substring(i, Math.min(i + n - numFriends + 1, n));
            if (sub.compareTo(ans) > 0) {
                ans = sub;
            }
        }
        return ans;
    }
}
