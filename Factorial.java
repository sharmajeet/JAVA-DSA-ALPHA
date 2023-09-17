package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int calcFactorial(int n) {
        // base case{
        if (n == 1 || n == 0) {
            return 1;
        }

        // kaam factorial = n*(n-1)*(n-2)...*(n-n)
        int fact_nm1 = calcFactorial(n - 1);
        int factorial = n * fact_nm1;
        return factorial;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for N : ");
        int n = sc.nextInt();
        // calling function
        int ans = calcFactorial(n);
        System.out.println("Factorial : " + ans);
        sc.close();
    }

}

/* 
 pubic static int factorial(int n){
    //base case
    if(n==0 || n==1){
        return 1;
    }
    //kaam fact = n *(n-1)
    int minus1 = factorial(n-1);
    int fact = n * minus1;
    return fact;
 }
 */