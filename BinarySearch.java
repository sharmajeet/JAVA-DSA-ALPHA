
//<------------------------TIME COMPEXITY = O(loog n)------------------------------>
import java.util.*;

public class BinarySearch {

    public static int binarySearch(int array[], int key) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // 1st condition
            if (array[mid] == key) {
                return mid;
            }
            // 2nd condition if mid is less than key value then start searching from right
            // most element of mid so start = mid+1.
            if (array[mid] < key) {
                start = mid + 1;
            }
            // 3rd condition if mid is greater than key value then end searching from left
            // most element of mid so end = mid-1.
            else {
                end = mid - 1; // end - 1 ,so only left side elements would be searched
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int array[] = { 788, 44, 66, 84, 25, 75, 96, 48, 53 };
        System.out.println("Enter the array elements : ");
        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            // System.out.print("index : "+ array[i+1] + " = ");
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the key for searching element from the array : ");
        int key = sc.nextInt();
        System.out.println("Value found at index : " + binarySearch(array, key));
        sc.close();

    }
}