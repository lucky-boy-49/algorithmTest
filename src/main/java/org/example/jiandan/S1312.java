package org.example.jiandan;

/**
 * 1812. 判断国际象棋棋盘中一个格子的颜色
 */
public class S1312 {
    public boolean squareIsWhite(String coordinates) {
        return (coordinates.charAt(0) % 2 == 1) == (coordinates.charAt(1) % 2 != 1);
    }
}
