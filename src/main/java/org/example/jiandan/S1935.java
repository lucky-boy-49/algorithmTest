package org.example.jiandan;

/**
 * 1935. 可以输入的最大单词数
 */
public class S1935 {
    public int canBeTypedWords(String text, String brokenLetters) {
        int flag = 0;
        for (char c : brokenLetters.toCharArray()) {
            if ((flag >> c & 1) == 0) {
                flag |= 1 << c;
            }
        }
        int res = 0;
        boolean f = true;
        for (char c : text.toCharArray()) {
            if (c == ' ' && f) {
                res++;
            } else if (c != ' ' && (flag >> c & 1) == 1) {
                f = false;
            } else if (c == ' ') {
                f = true;
            }
        }
        if (f) {
            res++;
        }
        return res;
    }
}
