package ru.job4j.puzzle;

public class Win {
    public static boolean checkVertical(int[][] board) {
        boolean result = false;
        int win5 = 0;
        int column = 0;
        for (int row = 0; row < board.length && column < board.length; row++) {
            if (board[row][column] == 1) {
                win5++;
                if (win5 == 5) {
                    result = true;
                }
            } else {
                column++;
                row = -1;
                win5 = 0;
            }
        }
        return result;
    }

    public static boolean checkGorizontal(int[][] board) {
        boolean result = false;
        int win5 = 0;
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                if (board[row][column] == 1) {
                    win5++;
                    if (win5 == 5) {
                        return true;
                    }
                } else {
                    win5 = 0;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean check(int[][] board) {
        return checkVertical(board) || checkGorizontal(board);
    }
}

