public class SelectionSort1 {
    public static void sorting(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_pos]) {
                    min_pos = j;
                }
            }
            // swap
            int temp = arr[min_pos];
            arr[min_pos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 9, 7, -9, 53, 2 };
        sorting(arr);
        printArr(arr);
    }

}
