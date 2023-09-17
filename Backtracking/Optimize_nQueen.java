// public class Optimize_nQueen {
//     public static void nQueens(char board[][], int row) {
//         // base case
//         if (row == board.length) {
//             // printBoard(board);
//             count++;
//             return;
//         }
//         // recursive call
//         for (int col = 0; col < board.length; col++) {
//             if (isValid(board, row, col) == true) {
//                 board[row][col] = 'Q';
//                 nQueens(board, row + 1);
//                 // backtracking
//                 board[row][col] = 'X';
//             }
//         }
//     }

//     public static boolean isValid(char board[][], int row, int col) {
//         // vertical up
//         for (int i = row - 1; i >= 0; i--) {
//             if (board[i][col] == 'Q') {
//                 return false;
//             }
//         }
//         // diagonal up left
//         for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
//             if (board[i][j] == 'Q') {
//                 return false;
//             }
//         }
//         // diagonal up right
//         for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
//             if (board[i][j] == 'Q') {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void printBoard(char board[][]) {
//         System.out.println("-----------Chess Board-------------");
//         for (int i = 0; i < board.length; i++) {
//             for (int j = 0; j < board.length; j++) {
//                 System.out.print(board[i][j] + " ");

//             }
//             System.out.println();
//         }

//     }

//     static int count = 0;

//     public static void main(String[] args) {
//         int n = 5;
//         char board[][] = new char[n][n];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 board[i][j] = 'X';
//             }
//         }
//         nQueens(board, 0);
//         System.out.println("Total ways to place nqueens are : "  + count);
//     }
// }

// 2nd way to print only 1 possible solution 

public class Optimize_nQueen {
    public static boolean nQueens(char board[][], int row) {
        // base case
        if (row == board.length) {
            printBoard(board);
            return true;
        }
        // recursive case
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                // recursion ,, if solution is possible for row-1 elements then return true
                // otherwise return false.
                if (nQueens(board, row + 1)) {
                    return true;
                }
                // backtraking
                board[row][col] = 'X';
            }
        }
        return false;
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
        if (nQueens(board, 0)) {
            System.out.println("Solution is Possible : ");
            printBoard(board);
        } else {
            System.out.println("Solution is not Possible.");
        }
    }
}
