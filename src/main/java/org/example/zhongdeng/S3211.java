package org.example.zhongdeng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S3211 {
    public List<String> validStrings(int n) {
        List<String> res = Arrays.asList("0", "1");
        int i = 2;
        while (i <= n) {
            i++;
            List<String> resNew = new ArrayList<>();
            res.forEach(s -> {
                if (s.endsWith("1")) {
                    resNew.add(s + "0");
                }
                resNew.add(s + "1");
            });
            res = resNew;
        }
        return res;
    }
}
