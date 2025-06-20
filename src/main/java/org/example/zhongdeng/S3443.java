package org.example.zhongdeng;

import java.util.HashMap;
import java.util.Map;

/**
 * 3443. K 次修改后的最大曼哈顿距离
 */
public class S3443 {

    private final static Map<Character, int[]> map = new HashMap<>();
    private final static Map<Character, Character> map2 = new HashMap<>();

    static {
        map.put('N', new int[]{0, 1});
        map.put('S', new int[]{0, -1});
        map.put('E', new int[]{1, 0});
        map.put('W', new int[]{-1, 0});
        map2.put('N', 'S');
        map2.put('S', 'N');
        map2.put('E', 'W');
        map2.put('W', 'E');
    }

    public int maxDistance(String s, int k) {
        char[] sCharArray = s.toCharArray();
        int ans = 0;
        ans = Math.max(ans, getMax(sCharArray, 'N', 'E', k));
        ans = Math.max(ans, getMax(sCharArray, 'N', 'W', k));
        ans = Math.max(ans, getMax(sCharArray, 'S', 'E', k));
        ans = Math.max(ans, getMax(sCharArray, 'S', 'W', k));
        return ans;
    }

    private int getMax(char[] sCharArray, char c1, char c2, int k) {
        int num1 = 0, num2 = 0, ans = 0;
        for (char c3 : sCharArray) {
            int[] arr = map.get(c3);
            if ((c3 == map2.get(c1) || c3 == map2.get(c2)) && k > 0) {
                num1 -= arr[0];
                num2 -= arr[1];
                ans = Math.max(ans, Math.abs(num1) + Math.abs(num2));
                k--;
            } else {
                num1 += arr[0];
                num2 += arr[1];
                ans = Math.max(ans, Math.abs(num1) + Math.abs(num2));
            }
        }
        return ans;
    }

}
