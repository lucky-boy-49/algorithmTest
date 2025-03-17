package org.example.zhongdeng;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 1963. 使字符串平衡的最小交换次数
 */
public class S1963 {
    public int minSwaps(String s) {
        Deque<Character> deque = new LinkedList<>();
        char[] chars = s.toCharArray();
        int l = 0, r = chars.length - 1, res = 0;
        while (l <= r) {
            if (chars[l] == '[') {
                deque.push(chars[l]);
            } else if (chars[l] == ']' && deque.isEmpty()) {
                while (chars[r] != '[') {
                    r--;
                }
                char temp = chars[r];
                chars[r] = chars[l];
                chars[l] = temp;
                r--;
                deque.push('[');
                res++;
            } else {
                deque.poll();
            }
            l++;
        }
        return res;
    }
}
