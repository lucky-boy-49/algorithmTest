package org.example.zhongdeng;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.IntStream;

/**
 * 3218. 切蛋糕的最小总开销 I
 */
public class S3218 {
    public int minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        List<int[][]> paths = new ArrayList<>();
        paths.add(new int[][]{{0, m}, {0, n}});
        Queue<Size> queue = new PriorityQueue<>((a, b) -> b.cost - a.cost);
        int res = 0;
        IntStream.range(0, horizontalCut.length)
                .mapToObj(i -> new Size("h", horizontalCut[i], i))
                .forEach(queue::offer);
        IntStream.range(0, verticalCut.length)
                .mapToObj(i -> new Size("v", verticalCut[i], i))
                .forEach(queue::offer);
        while (!queue.isEmpty()) {
            Size size = queue.poll();
            List<int[][]> paths2 = new ArrayList<>();
            for (int[][] path : paths) {
                int[][] newPath1 = null;
                int[][] newPath2 = null;
                int index = size.index + 1;
                if ("h".endsWith(size.name) && path[0][0] < index && path[0][1] > index) {
                    res += size.cost;
                    newPath1 = new int[][]{{path[0][0], index}, path[1]};
                    newPath2 = new int[][]{{index, path[0][1]}, path[1]};
                } else if ("v".endsWith(size.name) && path[1][0] < index && path[1][1] > index) {
                    res += size.cost;
                    newPath1 = new int[][]{path[0], {path[1][0], index}};
                    newPath2 = new int[][]{path[0], {index, path[1][1]}};
                }
                if (newPath1 == null) {
                    paths2.add(path);
                }
                if (newPath1 != null && (newPath1[0][1] - newPath1[0][0] != 1 || newPath1[1][1] - newPath1[1][0] != 1)) {
                    paths2.add(newPath1);
                }
                if (newPath2 != null && (newPath2[0][1] - newPath2[0][0] != 1 || newPath2[1][1] - newPath2[1][0] != 1)) {
                    paths2.add(newPath2);
                }
            }
            paths = paths2;
            if (paths.isEmpty()) {
                return res;
            }
        }
        return res;
    }
}

class Size {
    String name;
    int cost;
    int index;

    public Size(String name, int cost, int index) {
        this.name = name;
        this.cost = cost;
        this.index = index;
    }
}