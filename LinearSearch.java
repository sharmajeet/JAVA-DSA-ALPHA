//<------------TIME COMPLEXITY = "O(n)"---------------->

import java.util.*;
public class LinearSearch {
    public static int linearSearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            } else {
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = { 44, 66, 52, 99, 55, 26, 85, 24 };
        System.out.println("Enter Key for Search : ");
        int key = sc.nextInt();
        int index = linearSearch(number, key);
        if (index == -1) {
            System.out.println("Not Found in Array.");
        } else {
            System.out.println("Number Found At Index : " + index);
        }
    }

}