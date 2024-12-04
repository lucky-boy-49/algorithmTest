package org.example.kunnan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S2056_2 {
    private final static Map<String, int[][]> map = new HashMap<>();
    private static final int[][] rookDirections = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    private static final int[][] bishopDirections = {{1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
    private static final int[][] queenDirections = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};

    static {
        map.put("rook", rookDirections);
        map.put("bishop", bishopDirections);
        map.put("queen", queenDirections);
    }

    String[] pieces;
    int[][] positions;
    int n;
    int res = 0;
    List<Movement> stack = new ArrayList<>();

    public int countCombinations(String[] pieces, int[][] positions) {
        this.pieces = pieces;
        this.positions = positions;
        this.n = pieces.length;
        dfs(0);
        return res;
    }

    private void dfs(int u) {
        if (u == n) {
            res++;
            return;
        }
        int[][] directions = map.get(pieces[u]);
        // 处理第 u 个棋子原地不动的情况
        stack.add(new Movement(positions[u][0], positions[u][1], positions[u][0], positions[u][1], 0, 0));
        if (check(u)) {
            dfs(u + 1);
        }
        stack.remove(stack.size() - 1);

        // 枚举第 u 个棋子在所有方向、所有步数的情况
        for (int[] direction : directions) {
            for (int j = 1; j < 8; j++) {
                int x = positions[u][0] + direction[0] * j;
                int y = positions[u][1] + direction[1] * j;
                if (x < 1 || x > 8 || y < 1 || y > 8) {
                    break;
                }
                stack.add(new Movement(positions[u][0], positions[u][1], x, y, direction[0], direction[1]));
                if (check(u)) {
                    dfs(u + 1);
                }
                stack.remove(stack.size() - 1);
            }
        }
    }

    // 判断第 u 个棋子是否之前的棋子在移动过程中相遇
    private boolean check(int u) {
        for (int v = 0; v < u; v++) {
            if (stack.get(u).cross(stack.get(v))) {
                return false;
            }
        }
        return true;
    }
}

class Movement {
    public final int START_X;
    public final int START_Y;
    public final int END_X;
    public final int END_Y;
    public final int DX;
    public final int DY;
    public int curX;
    public int curY;

    public Movement(int startX, int startY, int endX, int endY, int dx, int dy) {
        this.START_X = startX;
        this.START_Y = startY;
        this.END_X = endX;
        this.END_Y = endY;
        this.DX = dx;
        this.DY = dy;
        this.curX = startX;
        this.curY = startY;
    }

    public void reset() {
        curX = START_X;
        curY = START_Y;
    }

    public boolean stopped() {
        return curX != END_X || curY != END_Y;
    }

    public void advance() {
        if (stopped()) {
            curX += DX;
            curY += DY;
        }
    }

    public boolean cross(Movement oth) {
        // 每次判断是否相遇时需要重置 cur
        reset();
        oth.reset();
        while (stopped() || oth.stopped()) {
            advance();
            oth.advance();
            if (curX == oth.curX && curY == oth.curY) {
                return true;
            }
        }
        return false;
    }
}
