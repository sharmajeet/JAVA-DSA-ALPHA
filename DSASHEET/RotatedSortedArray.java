package DSASHEET;

public class RotatedSortedArray {

    public static int search(int array[],int target){
            int res =0;
            int a =0 ;
        for(int i=0;i<array.length;i++){
            if(array[i] == target){
               res = i; //give index of array[i] element
               a++;
            }}
            if(a> 0 ){
                System.out.println(res);            
        }else{

            System.out.println("-1");
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[] ={4,5,6,7,0,1,2};
        int target = 0;
        search(array, target);
    }
}

// package DSASHEET;

// import java.util.*;

// class RotatedSortedArray {
//     public static int search(int array[], int target) {
//         int result = 0;
//         int count = 0;

//         for (int i = 0; i < array.length; i++) {
//             if (array[i] == target) {
//                 result = i;
//                 count++;
//             }

//             if (count > 0) {
//                 System.out.print(result);
//             }
//         }
//         System.out.print("-1");
//         return -1;
//     }

//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         int array[] = { 4, 5, 6, 7, 0, 1, 2 };

//         int target = 0;
//         search(array, target);
//     }

// }