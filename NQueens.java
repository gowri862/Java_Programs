public class NQueens {

    public static void solveNQueens(int n) {
        char[][] board = new char[n][n];

        // Initialize the board with '.'
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';

        placeQueens(board, 0, n);
    }

    private static void placeQueens(char[][] board, int row, int n) {
        if (row == n) {
            printBoard(board);
            System.out.println();
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 'Q';
                placeQueens(board, row + 1, n);
                board[row][col] = '.'; // Backtrack
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col, int n) {
        // Check column
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q') return false;

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q') return false;

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++)
            if (board[i][j] == 'Q') return false;

        return true;
    }

    private static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char c : row)
                System.out.print(c + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Solutions for " + n + "-Queens:");
        solveNQueens(n);
    }
}
