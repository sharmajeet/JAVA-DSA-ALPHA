package Recursion;

import java.util.Scanner;

public class SumOf_n {
    public static void sumOfn(int i, int n, int sum) {
        if (i == n) {
            sum = sum + i;
            System.out.println("Sum is : " + sum);
            return;
        }
        sum = sum + i;
        sumOfn(i + 1, n, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for N : ");
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        // calling function
        sumOfn(i, n, sum);
        sc.close();
    }
}
