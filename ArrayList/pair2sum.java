import java.util.*;

public class pair2sum {
    public static boolean isPair(ArrayList<Integer> list, int target) {
        // first we find brack point in our arraylist
        int brackPoint = -1;
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                brackPoint = i;

                break;
            }
        }
        // now we declare and use two pointer functionality.
        int left_ptr = brackPoint + 1;
        int right_ptr = brackPoint;
        while (left_ptr != right_ptr) {
            // case1
            if (list.get(left_ptr) + list.get(right_ptr) == target) {
                return true;
            }
            // case 2
            if (list.get(left_ptr) + list.get(right_ptr) < target) {
                // modulo function which is used for traversing array in circular form.
                left_ptr = (left_ptr + 1) % n;
            } else {
                // case 3
                right_ptr = (n + right_ptr - 1) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(15);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        int target = 16;
        System.out.println(isPair(list, target));
    }
}

// // public class NQueen {
//     public static boolean isSafe(char board[][] , int row,int col){
//         // vertical up
//         for(int i=row-1;i>=0;i--){
//             if(board[i][col] == 'Q'){
//                 return false;
//             }
//         }
//         // Diagonal up left
//         for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
//             if(board[i][j] == 'Q'){
//                 return false;
//             }
//         }
//         // Diagonal up right
//         for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
//             if(board[i][j] == 'Q'){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void nQueens(char board[][], int row) {
//         // base case
//         if (row == board.length) {
//             printBoard(board);
//             return;
//         }

//         for (int col = 0; col < board.length; col++) {
//             if (isSafe(board,row,col)) {
//                 board[row][col] = 'Q';
//                 nQueens(board, row + 1);
//                 board[row][col] = 'X';
//             }

//         }
//     }

//     public static void printBoard(char board[][]) {
//         System.out.println("--------------chess board---------------");
//         for (int i = 0; i < board.length; i++) {
//             for (int j = 0; j < board.length; j++) {
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {

//         int n = 4;
//         char board[][] = new char[n][n];
//         // initialize
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 board[i][j] = 'X';
//             }
//         }
//         nQueens(board, 0);
//     }

// }

// // 