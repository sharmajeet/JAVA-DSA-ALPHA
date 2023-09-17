import java.util.Arrays;

public class BinarySearch {
    public static int search(int arr[], int key) {

        int start = 0;
        int end = arr.length - 1;

        // condition
        while (start <= end) {
            int mid = (start + end) / 2;
            // comparision...
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 8, 9 };
        int key = 1;
        System.out.println("Value find at : " + search(arr, key));
    }
}

