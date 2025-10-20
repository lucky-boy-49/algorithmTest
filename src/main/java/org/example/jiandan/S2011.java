package org.example.jiandan;

/**
 * 2011. 执行操作后的变量值
 */
public class S2011 {

    public int finalValueAfterOperations(String[] operations) {
        var ans = 0;
        for (String operation : operations) {
            ans += switch (operation) {
                case  "--X", "X--" -> -1;
                case  "++X", "X++" -> 1;
                default -> 0;
            };
        }
        return ans;
    }
}
