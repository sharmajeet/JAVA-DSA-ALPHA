package DSASHEET;

import java.util.Scanner;

public class PrimeNumber{
    public static void isprime(int num , boolean flag){
        for(int i=2;i<num/2;i++){
            if(num % i == 0){
                // System.out.println(" ");
                flag= true;
            }
           else{
           flag = false;
           }
        
        }
        if(flag == true){System.out.println("Not A Prime Number.");}
        else{System.out.println("Prime Number.");}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num =sc.nextInt();
        boolean flag = false;
        isprime(num, flag);
        
    }
}

