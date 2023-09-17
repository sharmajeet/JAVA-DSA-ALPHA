public class NQueen {
    public static void nQueens(char board[][], int row) {
        // base case
        if (row == board.length) {
            printBoard(board);
            return;
        }
        // recursive case
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                // recursion
                nQueens(board, row + 1);
                // backtraking
                board[row][col] = 'X';
            }
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // vertically up
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // diagonal up left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diagonal up right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;

    }

    public static void printBoard(char board[][]) {
        System.out.println("--------------chess board---------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nQueens(board, 0);
    }
}
