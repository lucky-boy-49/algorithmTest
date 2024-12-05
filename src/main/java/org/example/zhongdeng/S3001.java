package org.example.zhongdeng;

/**
 * 3001. 捕获黑皇后需要的最少移动次数
 */
public class S3001 {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        return 2 - ((
                (a == e && (a != c || (d > b) == (d > f))) ||
                        (b == f && (b != d || (c > a) == (c > e))) ||
                        (c - e == d - f && (c - a != d - b || (a > c) == (a > e))) ||
                        (c - e == f - d && (c - a != b - d || (a > c) == (a > e)))
        ) ? 1 : 0);
    }
}
