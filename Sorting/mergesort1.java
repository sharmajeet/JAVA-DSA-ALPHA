public class mergesort1 {
    // print fun
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // recursive function
    public static void mergesort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        // value of mid
        int mid = si + (ei - si) / 2;
        // else part recusrion
        mergesort(arr, si, mid); // left part
        mergesort(arr, mid + 1, ei); // right part

        // merge function for all comaprision and conditions check
        merge(arr, si, mid, ei);
    }

    // merge function
    public static void merge(int arr[], int si, int mid, int ei) {
        // temp array
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        // comaparision
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // leftout elements
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // merging and updating arr as temp
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 7, 8, 3, 1 };

        mergesort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
