package org.example.jiandan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 2273. 移除字母异位词后的结果数组
 */
public class S2273 {
    public List<String> removeAnagrams(String[] words) {
        if (words.length == 1) {
            return List.of(words[0]);
        }
        var left = 0;
        var right = 1;
        while (right < words.length) {
            if (!isAnagrams(words[left], words[right])) {
                words[++left] = words[right];
            }
            right++;
        }
        return new ArrayList<>(List.of(words).subList(0, left + 1));
    }

    public boolean isAnagrams(String str1, String str2) {
        var flag = new HashMap<Character, Integer>(str1.length());
        for (char c : str1.toCharArray()) {
            flag.merge(c, 1, Integer::sum);
        }

        for (char c : str2.toCharArray()) {
            flag.merge(c, -1, Integer::sum);
            if (flag.get(c) == 0) {
                flag.remove(c);
            }
        }
        return flag.isEmpty();
    }

}
