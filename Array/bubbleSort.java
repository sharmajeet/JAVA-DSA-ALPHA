public class bubbleSort {
    public static void sorting(int arr[]) {
        int n = arr.length - 1;
        // first loop for outer part  TC : n-time
        for (int turn = 0; turn < n; turn++) {
            // TC = n-time
            for (int i = 0; i < n - turn; i++) {
                if (arr[i] > arr[i + 1]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 7, 5, 4, 1, 2, 3, 6 };
        sorting(arr);
        printArr(arr);
    }

}

// Time complexity = o(n2)