public class QuickSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // recursive function
    public static void quicksort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        int pIdx = partition(arr, si, ei);
        quicksort(arr, si, pIdx-1); // left part
        quicksort(arr, pIdx + 1, ei); // right part

    }

    public static int partition(int arr[], int si, int ei) {
        // initialize PIVOT element
       
        int pivot = arr[ei]; // last element is pivot
        int i = si - 1; // kaam he jagah banana for elements thats are less then pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++; // so i become [1] ehear
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // now put pivote at correct index
        i++;
        // swap
        int temp = pivot; // call by value used hear throw index we changed
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }

    public static void main(String[] args) {
        int arr[] = { 1,5,-9,2,-3,5,4};
        quicksort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
