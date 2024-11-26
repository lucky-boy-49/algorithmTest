package org.example.jiandan;

/**
 * 3206. 交替组 I
 */
public class S3206 {
    public int numberOfAlternatingGroups(int[] colors) {
        int res = 0;
        if (colors == null || colors.length == 0) return res;
        if (colors[1] == colors[colors.length - 1] && colors[1] != colors[0]) res++;
        if (colors[0] == colors[colors.length - 2] && colors[colors.length - 2] != colors[colors.length - 1]) res++;
        for (int i = 1; i < colors.length - 1; i++) {
            if (colors[i - 1] == colors[i + 1] && colors[i] != colors[i - 1]) res++;
        }
        return res;
    }
}
