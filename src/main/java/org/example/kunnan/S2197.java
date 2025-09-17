package org.example.kunnan;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 2197. 替换数组中的非互质数
 */
public class S2197 {

    public List<Integer> replaceNonCoprimes(int[] nums) {
        Deque<Integer> s = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            int last = s.isEmpty() ? 1 : s.pollFirst();
            if (getGCD(last, nums[i]) == 1) {
                if (i != 0) {
                    s.push(last);
                }
                s.push(nums[i]);
            } else {
                s.push((int) getLCM(last, nums[i]));
            }
            while (!s.isEmpty() && s.size() >= 2) {
                Integer one = s.pollFirst();
                Integer two = s.pollFirst();
                if (getGCD(one, two) == 1) {
                    s.push(two);
                    s.push(one);
                    break;
                } else {
                    s.push((int) getLCM(one, two));
                }
            }
        }
        List<Integer> ans = new LinkedList<>();
        while (!s.isEmpty()) {
            ans.add(s.pollLast());
        }
        return ans;
    }

    private long getLCM(int num1, int num2) {
        return (long) num1 * num2 / getGCD(num1, num2);
    }

    private int getGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
