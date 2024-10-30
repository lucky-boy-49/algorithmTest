package org.example.jiandan;

public class S3216 {
    public String getSmallestString(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i - 1] > charArray[i]) {
                if (Integer.parseInt(String.valueOf(charArray[i - 1])) % 2 ==
                        Integer.parseInt(String.valueOf(charArray[i])) % 2) {
                    char temp = charArray[i];
                    charArray[i] = charArray[i - 1];
                    charArray[i - 1] = temp;
                    break;
                }
            }
        }
        return new String(charArray);
    }
}
