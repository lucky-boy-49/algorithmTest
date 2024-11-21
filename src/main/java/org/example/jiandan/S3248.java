package org.example.jiandan;

import java.util.List;

public class S3248 {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i = 0, j = 0;
        for (String command : commands) {
            switch (command.charAt(0)) {
                case 'U' -> i--;
                case 'D' -> i++;
                case 'L' -> j--;
                default -> j++;
            }
        }
        return (i * n) + j;
    }
}
