public class MergeSort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // recursive function for mergesort
    public static void mergesort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // kaam
        int mid = si + (ei - si) / 2; // (si+ei)/2;
        mergesort(arr, si, mid);// for Left part
        mergesort(arr, mid + 1, ei);// for Right part
        // it's a separate function for merging array elements
        merge(arr, si, mid, ei);// for whole array
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        // creating temp variable for store sorting array..arr
        int temp[] = new int[ei - si + 1]; // size of temp array is(end i - start i +1);
        int i = si; // now i is iterator for starting index.
        int j = mid+1; // now j is iterator for mid element index.
        int k = 0; // k is for traversing all element of temp array.

        // applying conditions for sorting and comparision
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                // arr[i] > arr[j] then..
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // for leftover elements of 1st sorted part,left part ..
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // same for leftover elements of 2nd sorted part,means right part..
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // now copy sorted array that is stored in temp[]
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 5, 7, 3, 1, 2,-5};
        mergesort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}