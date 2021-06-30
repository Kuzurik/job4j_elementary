package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int value : board[row]) {
            if (value != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}
