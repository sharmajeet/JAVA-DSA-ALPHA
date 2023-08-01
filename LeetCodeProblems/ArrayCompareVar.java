package LeetCodeProblems;
// this problem is from codechef Problem no 1..

// Output FormatOutput a single integer in a single line - the number of weeks in which Chef solved at least 
// 10
// 10 problems.

public class ArrayCompareVar {
    public static void check(int array[]) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 10) {
                count++;
            }
        }
        System.out.print(count);
    }

    public static void main(String[] args) {
        int array[] = { 12, 15, 8, 10 };
        check(array);
    }

}

// actual submited code
/*
 * 
 * import java.util.*;
 * import java.lang.*;
 * import java.io.*;
 * 
 * class Codechef
 * {
 * public static void main (String[] args) throws java.lang.Exception
 * {
 * Scanner sc = new Scanner(System.in);
 * // your code goes here
 * int array[] =new int[4];
 * int count =0;
 * 
 * for(int i=0;i<array.length;i++){
 * array[i] =sc.nextInt();
 * {
 * if(array[i] >= 10){
 * count++;
 * }
 * }
 * }
 * System.out.print(count);
 * }
 * }
 */
