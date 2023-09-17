public class mergesort1 {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergesort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        // finding mid first
        int mid = si + (ei - si) / 2;
        mergesort(arr, si, mid);// left part
        mergesort(arr, mid + 1, ei);// right part
        // for mergeing array
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        // define temp
        int temp[] = new int[ei-si + 1];// length define for temp array
        int i = si;
        int j = mid + 1;
        int k = 0;

        // comparision
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

        // leftout - left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // leftout- right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // now returing and merging array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5,4,3,2,1};
        mergesort(arr, 0, arr.length - 1);
        printArr(arr);
    }

}