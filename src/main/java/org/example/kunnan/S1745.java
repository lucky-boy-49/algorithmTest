package org.example.kunnan;

/**
 * 1745. 分割回文串 IV
 */
public class S1745 {

    public boolean checkPartitioning(String s) {
        int n = s.length();
        boolean[][] isPalindrome = new boolean[n][n];
        for (int length = 1; length < n; length++) {
            for (int start = 0; start <= n - length; start++) {
                int end = start + length - 1;
                if (length == 1) {
                    isPalindrome[start][end] = true;
                } else {
                    boolean b = s.charAt(start) == s.charAt(end);
                    if (length == 2) {
                        isPalindrome[start][end] = b;
                    } else {
                        isPalindrome[start][end] = (b && (isPalindrome[start + 1][end - 1]));
                    }
                }
            }
        }
        for (int start = 1; start < n - 1; start++) {
            if (!isPalindrome[0][start - 1]) {
                continue;
            }
            for (int end = start; end < n - 1; end++) {
                if (isPalindrome[start][end] && isPalindrome[end + 1][n - 1]) {
                    return true;
                }
            }
        }
        return false;
    }

}
