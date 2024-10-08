package org.example.kunnan;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class S2306 {
    public long distinctNames(String[] ideas) {
        Map<Character, Set<String>> names = new HashMap<>();
        for (String idea : ideas) {
            names.putIfAbsent(idea.charAt(0), new HashSet<>());
            names.get(idea.charAt(0)).add(idea.substring(1));
        }
        long ans = 0;
        for (Map.Entry<Character, Set<String>> entryA : names.entrySet()) {
            char preA = entryA.getKey();
            Set<String> setA = entryA.getValue();
            for (Map.Entry<Character, Set<String>> entryB : names.entrySet()) {
                char preB = entryB.getKey();
                Set<String> setB = entryB.getValue();
                if (preA == preB) {
                    continue;
                }
                int intersect = getIntersectSize(setA, setB);
                ans += (long) (setA.size() - intersect) * (setB.size() - intersect);
            }
        }
        return ans;
    }

    private int getIntersectSize(Set<String> a, Set<String> b) {
        int ans = 0;
        for (String s : a) {
            if (b.contains(s)) {
                ans++;
            }
        }
        return ans;
    }
}