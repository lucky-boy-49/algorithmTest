package org.example.zhongdeng;

import java.util.ArrayList;
import java.util.List;

/**
 * 131. 分割回文串
 */
public class S131 {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();
        dfs(ans, path, s, 0);
        return ans;
    }

    private void dfs(List<List<String>> ans, List<String> path, String s, int i) {
        if (i == s.length()) {
            ans.add(List.copyOf(path));
        }
        for (int j = i; j < s.length(); j++) {
            String substring = s.substring(i, j + 1);
            if (check(substring)) {
                path.add(substring);
                dfs(ans, path, s, j + 1);
                path.removeLast();
            }
        }
    }

    private boolean check(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
