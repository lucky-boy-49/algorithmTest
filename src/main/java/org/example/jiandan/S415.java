package org.example.jiandan;

/**
 * 415. 字符串相加
 */
public class S415 {
    public String addStrings(String num1, String num2) {
        StringBuilder ans = new StringBuilder();
        if (num1.length() < num2.length()) {
            String tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        int difference = num1.length() - num2.length(), carry = 0;
        for (int i = num1.length() - 1; i >= 0; i--) {
            int and;
            int parseInt = Integer.parseInt(num1.substring(i, i + 1));
            if (i >= difference) {
                and = parseInt + Integer.parseInt(num2.substring(i - difference, i - difference + 1)) + carry;
            } else {
                and = parseInt + carry;
            }
            carry = 0;
            if (and >= 10) {
                carry = 1;
                and -= 10;
            }
            ans.insert(0, and);
        }
        if (carry == 1) {
            ans.insert(0, 1);
        }
        return ans.toString();
    }
}
