package org.example.zhongdeng;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * 2349. 设计数字容器系统
 */
public class S2349 {

    private final Map<Integer, TreeSet<Integer>> map1;
    private final Map<Integer, Integer> map2;

    public S2349() {
        map1 = new HashMap<>(16);
        map2 = new HashMap<>(16);
    }

    public void change(int index, int number) {
        if (map2.containsKey(index)) {
            Integer oldNumber = map2.get(index);
            map1.get(oldNumber).remove(index);
            if (map1.get(oldNumber).isEmpty()) {
                map1.remove(oldNumber);
            }
            setNewNum(index, number);
        } else {
            setNewNum(index, number);
        }
    }

    private void setNewNum(int index, int number) {
        map2.put(index, number);
        if (map1.containsKey(number)) {
            map1.get(number).add(index);
        } else {
            TreeSet<Integer> set = new TreeSet<>();
            set.add(index);
            map1.put(number, set);
        }
    }

    public int find(int number) {
        if (map1.containsKey(number)) {
            return map1.get(number).first();
        }
        return -1;
    }
}
