package org.example.jiandan;

/**
 * 3274. 检查棋盘方格颜色是否相同
 */
public class S3274 {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        return (coordinate1.charAt(0) % 2 == 1) == (coordinate1.charAt(1) % 2 == 1) ==
                (coordinate2.charAt(0) % 2 == 1) == (coordinate2.charAt(1) % 2 == 1);
    }
}
