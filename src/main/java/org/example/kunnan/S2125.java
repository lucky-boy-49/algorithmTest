package org.example.kunnan;

/**
 * 2125. 银行中的激光束数量
 */
public class S2125 {
    public int numberOfBeams(String[] bank) {
        var pre = 0;
        var ans = 0;
        for (String s : bank) {
            var size = 0;
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    size++;
                }
            }
            ans += pre * size;
            if (size != 0) {
                pre = size;
            }
        }
        return ans;
    }
}
