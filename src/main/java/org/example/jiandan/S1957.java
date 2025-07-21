package org.example.jiandan;

/**
 * 1957. 删除字符使字符串变好
 */
public class S1957 {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        char[] sCharArray = s.toCharArray();
        ans.append(sCharArray[0]);
        char a = sCharArray[0];
        int num = 1;
        for (int i = 1; i < sCharArray.length; i++) {
            if (a == sCharArray[i]) {
                num++;
            } else {
                a = sCharArray[i];
                num = 1;
            }
            if (num <= 2) {
                ans.append(a);
            } else {
                num--;
            }
        }
        return ans.toString();
    }
}
