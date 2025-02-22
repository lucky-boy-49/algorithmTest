package org.example.jiandan;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * 2506. 统计相似字符串对的数目
 */
public class S2506 {
    public int similarPairs(String[] words) {
        AtomicInteger res = new AtomicInteger();
        Arrays.stream(words)
                .map(item -> {
                    int size = 0;
                    for (char c : item.toCharArray()) {
                        if (((size >> (int) c) & 1) == 0) {
                            size |= (1 << (int) c);
                        }
                    }
                    return size;
                })
                .collect(Collectors.toMap(
                        k -> k,
                        v -> 1,
                        (o, n) -> o + 1
                ))
                .forEach((k, v) -> {
                    if (v > 1) {
                        int i = 1;
                        while (i < v) {
                            res.addAndGet(i++);
                        }
                    }
                });
        return res.get();
    }
}
