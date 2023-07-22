import java.util.Scanner;

public class isArraySorted {
    public static boolean isSorted(int array[], int index) {
        // base case .. when to exit
        if (index == array.length - 1) {
            return true;
        }
        // condition OPTIMIZE SOLUTION
        if (array[index] >= array[index + 1]) {
            return false;
        } else {
            return isSorted(array, index + 1);
        }

        // // conditions
        // if (array[index] < array[index + 1]) {
        // return isSorted(array, index + 1); // continue unitl all elements are
        // traversed..
        // } else {
        // return false;
        // }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        System.out.print("Enter values for array : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array is sorted in increasing order : " + isSorted(array, 0));
    }
}