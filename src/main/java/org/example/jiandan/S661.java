package org.example.jiandan;

/**
 * 661. 图片平滑器
 */
public class S661 {
    public int[][] imageSmoother(int[][] img) {
        int[][] res = new int[img.length][img[0].length];
        int[][] flogs = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[i].length; j++) {
                int sum = img[i][j], size = 1;
                for (int[] flog : flogs) {
                    int i1 = i + flog[0];
                    int i2 = j + flog[1];
                    if (i1 >= 0 && i2 >= 0 && i1 < img.length && i2 < img[i].length) {
                        sum += img[i1][i2];
                        size++;
                    }
                }
                res[i][j] = sum / size;
            }
        }
        return res;
    }
}
