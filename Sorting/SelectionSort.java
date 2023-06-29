package Sorting;

import java.util.*;

public class SelectionSort {
    public static void sort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) { // for turn perform n-1 iteration
            int minPos = i; // considering minpos is our current i
            {
                for (int j = i + 1; j < array.length; j++)
                    if (array[minPos] > array[j]) {
                        minPos = j;
                    }
            }
            // swap
            int temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;

        }
    }

    public static void print(int array[]) {
        System.out.println("Sorted Array ..");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        System.out.println("Enter Values For Array : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        sort(array);
        print(array);
    }
}