package org.example.jiandan;

/**
 * 2843. 统计对称整数的数目
 */
public class S2843 {
    public int countSymmetricIntegers(int low, int high) {
        int ans = 0, size = String.valueOf(low).length();
        if (size % 2 == 1) {
            low = Integer.parseInt(getMaximums(size)) + 1;
            size++;
        }
        String maxNums = getMaximums(size);
        for (int i = low; i <= high; i++) {
            String value = String.valueOf(i);
            char[] chars = value.toCharArray();
            int flg = 0;
            for (int j = 0; j < chars.length; j++) {
                if (j < chars.length / 2) {
                    flg += chars[j] - '0';
                } else {
                    flg -= chars[j] - '0';
                }
            }
            if (flg == 0) ans++;
            if (value.equals(maxNums)) {
                i = Integer.parseInt(getMaximums(size + 1));
                size += 2;
            }
        }
        return ans;
    }

    private String getMaximums(int size) {
        return "9".repeat(Math.max(0, size));
    }
}
