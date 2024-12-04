package org.example.kunnan;

import java.util.HashMap;
import java.util.Map;

/**
 * 2056. 棋盘上有效移动组合的数目
 */
public class S2056 {
    private static final Map<String, int[][]> map = new HashMap<>();

    static {
        map.put("rook", new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}});
        map.put("queen", new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}});
        map.put("bishop", new int[][]{{1, 1}, {1, -1}, {-1, 1}, {-1, -1}});
    }

    private int res;

    public int countCombinations(String[] pieces, int[][] positions) {
        res = 0;
        int inx = 0;
        int[][] p = new int[9][9];
        dfs(inx, p, positions, pieces);
        return res;
    }

    private void dfs(int inx, int[][] p, int[][] positions, String[] pieces) {
        int l = positions[inx][0], r = positions[inx][1];
        if (p[l][r] == 0) {
            p[l][r] = 1;
            if (inx == pieces.length - 1) {
                res++;
            } else {
                dfs(inx + 1, p, positions, pieces);
            }
            p[l][r] = 0;
        } else {
            return;
        }
        for (int[] ints : map.get(pieces[inx])) {
            boolean flag = true;
            int size = 1;
            while (flag) {
                flag = false;
                l = positions[inx][0] + ints[0] * size;
                r = positions[inx][1] + ints[1] * size;
                if (l >= 1 && l < 9 && r >= 1 && r < 9) {
                    flag = true;
                    if (p[l][r] == 0) {
                        p[l][r] = 1;
                        if (inx == pieces.length - 1) {
                            res++;
                        } else {
                            dfs(inx + 1, p, positions, pieces);
                        }
                        p[l][r] = 0;
                    } else {
                        break;
                    }
                }
                size++;
            }
        }
    }
}
