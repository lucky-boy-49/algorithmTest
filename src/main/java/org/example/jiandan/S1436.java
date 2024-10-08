package org.example.jiandan;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S1436 {

    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        paths.forEach(l -> {
            set.add(l.get(0));
        });
        return paths.stream().filter(l -> !set.contains(l.get(1))).toList().get(0).get(1);
    }

}