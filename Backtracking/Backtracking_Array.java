// _______________________________TIME COMPLEXITY : O(n)___________________________________//
public class Backtracking_Array {
    // recursive function with back tracking
    public static void trackArr(int arr[], int index, int value) {
        // base case
        if (index == arr.length) {
            // so first we print simple recursive array elements
            System.out.println("recursive: ");
            printArr(arr);
            return;
        }
        // init value on index
        arr[index] = value;
        // recursive case
        trackArr(arr, index + 1, value + 1);
        // backtracking
        arr[index] = arr[index] - 2;
    }

    // first we create print array function
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        trackArr(arr, 0, 1);
        // now final array after backtracking print here.
        System.out.println("Backttracked : ");
        printArr(arr);

    }
}