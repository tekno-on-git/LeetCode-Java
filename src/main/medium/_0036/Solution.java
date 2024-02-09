package main.medium._0036;

import java.util.HashSet;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && (!checkRowColumn(i, j, board) || !checkBox(board)))
                    return false;
            }
        }

        return true;
    }

    public boolean checkRowColumn(int row, int col, char[][] board) {
        char c = board[row][col];
        for (int i = 0; i < 9; i++) {
            if (i != row && c == board[i][col])
                return false;
            if (i != col && c == board[row][i])
                return false;
        }
        return true;
    }

    public boolean checkBox(char[][] board) {
        for (int block = 0; block < 9; block++) {
            boolean[] m = new boolean[9];
            for (int i = block / 3 * 3; i < block / 3 * 3 + 3; i++) {
                for (int j = block % 3 * 3; j < block % 3 * 3 + 3; j++) {
                    if (board[i][j] != '.') {
                        if (m[(int) (board[i][j] - '1')]) {
                            return false;
                        }
                        m[(int) (board[i][j] - '1')] = true;
                    }
                }
            }
        }
        return true;

    }

    public boolean isValidSudokuSet(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.')
                    continue;

                String n_str = new String("(" + board[i][j] + ")");
                String r_str = new String(i + n_str);
                String c_str = new String(n_str + j);

                String sub_str = new String((i / 3) + n_str + (j / 3));
                if (!set.add(r_str) || !set.add(c_str) || !set.add(sub_str))
                    return false;
            }
        }
        return true;
    }

}