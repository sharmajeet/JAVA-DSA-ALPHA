public class GridWays {
    public static int findGridWay(int row, int col, int m, int n) {
        // base case
        if (row == m - 1 && col == n - 1) { // condition for last call
            return 1;

        } else if (row == m || col == n) {
            return 0;
        }
        // kaam
        int way1 = findGridWay(row + 1, col, m, n);
        int way2 = findGridWay(row, col + 1, m, n);
        return way1 + way2;
    }

    public static void main(String[] args) {

        int m = 4, n = 4;
        System.out.println(findGridWay(0, 0, m, n));
    }
}
