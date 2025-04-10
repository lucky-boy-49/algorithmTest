package org.example.jiandan;

/**
 * 405. 数字转换为十六进制数
 */
public class S405 {
    public String toHex(int num) {
        if (num == 0) return "0";
        String hex = "0123456789abcdef";
        StringBuilder ans = new StringBuilder();
        char[] hexCharArray = hex.toCharArray();
        while (num != 0 && ans.length() < 8) {
            ans.insert(0, hexCharArray[num & 0xf]);
            num >>= 4;
        }
        return ans.toString();
    }
}
