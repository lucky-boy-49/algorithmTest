package org.example.zhongdeng;

/**
 * 1717. 删除子字符串的最大得分
 */
public class S1717 {
    public int maximumGain(String s, int x, int y) {
        return x < y ? getMaximumGain(s, 'b', 'a', y, x) : getMaximumGain(s, 'a', 'b', x, y);
    }

    private int getMaximumGain(String s, char a, char b, int max, int min) {
        var ans = 0;
        StringBuilder newStr = new StringBuilder();
        ans += getAns(s, a, b, max, newStr);

        s = newStr.toString();
        newStr = new StringBuilder();
        ans += getAns(s, b, a, min, newStr);
        return ans;
    }

    private int getAns(String s, char a, char b, int size, StringBuilder newStr) {
        var ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (newStr.isEmpty()) {
                newStr.append(s.charAt(i));
            } else {
                if (newStr.charAt(newStr.length() - 1) == a && s.charAt(i) == b) {
                    ans += size;
                    newStr.deleteCharAt(newStr.length() - 1);
                } else {
                    newStr.append(s.charAt(i));
                }
            }
        }
        return ans;
    }
}
