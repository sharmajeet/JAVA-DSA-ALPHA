// package LeetCodeProblems;

// import java.util.*;

// class PairCount {
//     public static int[] count(int[] array) {
//         for (int i = 0; i < array.length; i++) {
//             for (int j = i + 1; j < array.length; j++) {
//                 int pair[] = {i,j};
//                 return new int[] { i, j };
//             }
//         }
//         return new int[] {};
//     }

//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int array[] = new int[5];
//         for(int i=0;i<array.length;i++){
//             array[i] = sc.nextInt();
//         }
//         count(array);
//         for(i=0;i<array.length;i++){
//         System.out.print("[");
//         System.out.print(pair[i]);
//         System.out.print(",");
//         System.out.print(pair[j]);
//     }
//     System.out.print("]");
// }
// }
package LeetCodeProblems;
import java.util.*;

class PairCount {
    public static int[] count(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int pair[] = {i, j};
                return pair;
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int[] pair = count(array);
        System.out.print("[");
        System.out.print(pair[0]);
        System.out.print(",");
        System.out.print(pair[1]);
        System.out.print("]");
    }
}
