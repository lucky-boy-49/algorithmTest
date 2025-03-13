package org.example.zhongdeng;

/**
 * 3305. 元音辅音字符串计数 I
 */
public class S3305 {

    public int countOfSubstrings(String word, int k) {
        final int VOWEL_MASK = 1065233;
        char[] s = word.toCharArray();
        long ans = 0;
        int[] cntVowel1 = new int['u' - 'a' + 1], cntVowel2 = new int['u' - 'a' + 1];
        int sizeVowel1 = 0, sizeVowel2 = 0; // 元音种类数
        int cntConsonant1 = 0, cntConsonant2 = 0;
        int left1 = 0, left2 = 0;
        for (char b : s) {
            b -= 'a';
            if ((VOWEL_MASK >> b & 1) > 0) {
                if (cntVowel1[b]++ == 0) {
                    sizeVowel1++;
                }
                if (cntVowel2[b]++ == 0) {
                    sizeVowel2++;
                }
            } else {
                cntConsonant1++;
                cntConsonant2++;
            }

            while (sizeVowel1 == 5 && cntConsonant1 >= k) {
                int out = s[left1] - 'a';
                if ((VOWEL_MASK >> out & 1) > 0) {
                    if (--cntVowel1[out] == 0) {
                        sizeVowel1--;
                    }
                } else {
                    cntConsonant1--;
                }
                left1++;
            }

            while (sizeVowel2 == 5 && cntConsonant2 > k) {
                int out = s[left2] - 'a';
                if ((VOWEL_MASK >> out & 1) > 0) {
                    if (--cntVowel2[out] == 0) {
                        sizeVowel2--;
                    }
                } else {
                    cntConsonant2--;
                }
                left2++;
            }

            ans += left1 - left2;
        }
        return (int) ans;
    }

}
