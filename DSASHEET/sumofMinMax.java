package DSASHEET;

// public  {
 import java.util.*;
 class sumofMinMax{
    public static void findValue(int array[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sumOfTwo =0;
        
        for(int i=0; i<array.length; i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        
        for(int j =0 ;j<array.length;j++){
            if(array[j]>max){
                max = array[j];
            }
        }
        sumOfTwo = max+min;
        System.out.println("Sum is : " + sumOfTwo);
    }
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int array[] =new int[N];
        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        findValue(array);
    }
}
