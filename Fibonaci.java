package Recursion;

import java.util.Scanner;

public class Fibonaci {
    public static void fib(int a, int b, int n) {
        // base case condition
        if (n == 0) {
            return;
        }
        // kaam a=0 ,b=1 and c=(0+1)=1 then d = (b+c(1+1)) =2..and so on
        int c = a + b;
        fib(b, c, n - 1);
        System.out.print(c + " ");

    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter value for N :");
        int n = sc.nextInt();
        // static pass
        System.out.print(a + " ");
        System.out.print(b + " ");
        // calling function
        fib(a, b, n - 2);
        sc.close();
    }

}
