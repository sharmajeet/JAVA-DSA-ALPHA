package LeetCodeProblems;
import java.util.Scanner;

public class GFG1_Reverse_Array{
    public static void reverse_array(int array[]) {
        int start =0 ;
        int end = array.length-1;
        while(start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end]=temp;

            start ++ ;
            end --;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Size Of Array : " );
        // int size = sc.nextInt();
        int array[]= new int[3];
        System.out.print("Enter values for Array : ");
        for(int i=0;i<array.length;i++){
           array[i] = sc.nextInt();
        }
        reverse_array(array);
        System.out.print("[");
            for(int j=0; j<array.length;j++){
                System.out.print(array[j]+",");
                
            }
            System.out.print("]");
        
       }
}
// public class GFG1_Reverse_Array{
//     public static void reverse(int array[]) {
//         int start = 0 ;
//         int end = array.length-1;
//         while(start < end){
//             int temp = array[start];
//             array[start]=array[end];
//             array[end]= temp;

//             start ++ ;
//             end --;
//         }
        
//     }
//     public static void print(int array[]) {
//         for(int i=0;i<array.length;i++){
//             System.out.print(array[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         System.out.print("Reversed Array : ");
//         int array[] = {5,4,3,2,1};
//         reverse(array);
//         print(array);
//     }
// }