package org.example.jiandan;

/**
 * 3136. 有效单词
 */
public class S3136 {

    private final char[] y = new char[] {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }
        int yN = 0, nYN = 0;
        for (char c : word.toCharArray()) {
            boolean isV = (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
            if (isV) {
                if (isY(c)) {
                    yN++;
                } else if (!(c <= '9')){
                    nYN++;
                }
            } else {
                return false;
            }
        }
        return yN != 0 && nYN != 0;
    }

    private boolean isY(char c) {
        for (char yC : y) {
            if (yC == c) {
                return true;
            }
        }
        return false;
    }

}
