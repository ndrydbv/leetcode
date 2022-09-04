class Solution {
    boolean[][] rowContained = new boolean[9][9];
    boolean[][] colContained = new boolean[9][9];
    boolean[][] blockContained = new boolean[9][9];

    public void solveSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[1].length; j++) {
                if (board[i][j] != '.') {
                    int val = board[i][j] - '1';
                    rowContained[i][val] = true;
                    colContained[j][val] = true;
                    blockContained[i / 3 * 3 + j / 3][val] = true;
                }
            }
        }
        helper(board, 0, 0);
    }

    private boolean helper(char[][] board, int i, int j) {
        if (i == board.length - 1 && j == board[i].length)
            return true;
        if (j == board[i].length) {
            j = 0;
            i++;
        }
        if (board[i][j] != '.')
            return helper(board, i, j + 1);

        for (int val = 0; val < 9; val++) {
            if (!rowContained[i][val] && !colContained[j][val] && !blockContained[i / 3 * 3 + j / 3][val]) {
                board[i][j] = (char)(val+'1');
                rowContained[i][val] = true;
                colContained[j][val] = true;
                blockContained[i / 3 * 3 + j / 3][val] = true;

                if (helper(board, i, j + 1))
                    return true;

                board[i][j] = '.';
                rowContained[i][val] = false;
                colContained[j][val] = false;
                blockContained[i / 3 * 3 + j / 3][val] = false;

            }
        }
        return false;
    }
}
