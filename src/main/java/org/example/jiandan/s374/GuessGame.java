package org.example.jiandan.s374;

public class GuessGame {
    protected int guess(int num) {
        if (num > 6) {
            return -1;
        } else if (num < 6) {
            return 1;
        } else {
            return 0;
        }
    }
}
