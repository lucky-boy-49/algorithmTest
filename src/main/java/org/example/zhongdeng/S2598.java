package org.example.zhongdeng;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 2598. 执行操作后的最大 MEX
 */
public class S2598 {
    public int findSmallestInteger(int[] nums, int value) {
        // 测试
        return Arrays.stream(nums).parallel()
                // 取模, 注意避免负数
                .map(num -> (num % value + value) % value)
                .boxed()
                // 分组求数量
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream().parallel()
                // (k,count) -> [k, k+value, k+2*value, ... , k+(count-1)*value]
                .flatMapToInt(e -> IntStream.iterate(e.getKey(), i -> i + value).limit(e.getValue()))
                .sorted()
                .reduce(-1, (i, j) -> i + 1 != j ? i : j) + 1;
    }
}
