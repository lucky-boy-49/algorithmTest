package org.example.jiandan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 999. 可以被一步捕获的棋子数
 */
public class S999 {
    public int numRookCaptures(char[][] board) {
        int[][] a = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        Map<Character, List<String>> map = new HashMap<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'R') {
                    map.computeIfAbsent('R', v -> new ArrayList<>()).add(i + "-" + j);
                } else if (board[i][j] == 'B') {
                    map.computeIfAbsent('B', v -> new ArrayList<>()).add(i + "-" + j);
                } else if (board[i][j] == 'p') {
                    map.computeIfAbsent('p', v -> new ArrayList<>()).add(i + "-" + j);
                }
            }
        }
        int count = 0;
        int[] r = Arrays.stream(map.get('R').get(0).split("-")).mapToInt(Integer::parseInt).toArray();
        List<String> b = map.get('B');
        List<String> p = map.get('p');
        for (int[] ints : a) {
            for (int i = 1; i <= 8; i++) {
                int l = r[0] + i * ints[0];
                int s = r[1] + i * ints[1];
                if (l < 8 && l >= 0 && s < 8 && s >= 0) {
                    if (b != null && b.contains(l + "-" + s)) {
                        break;
                    } else if (p != null && p.contains(l + "-" + s)) {
                        count++;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return count;
    }
}
