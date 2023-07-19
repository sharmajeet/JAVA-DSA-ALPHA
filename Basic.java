package Recursion;

import java.util.Scanner;

public class Basic {
    public static void printNumber(int n){
        if(n==0) //it is a base case ,, if condition met then it return from this method to main method
        return;

        System.out.print(n + " "); //print value of n

        printNumber(n-1); //this is actual recursive case where priintnumber(n) always decreas by 1 until base case condition not met..
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter value for n : ");
        int n = sc.nextInt();
        printNumber(n);
        sc.close();
    }
    
}
