package Array2D;

import java.util.Scanner;


public class Matrix {
    public static boolean search(int matrices[][] , int key){
     for (int i = 0; i < matrices.length; i++) {
            for (int j = 0; j < matrices[0].length; j++) {
              if(matrices[i][j] == key){
                System.out.print("Key value find at ("+ i +","+j+")");
                return true;
              }
            }
            
        }
        System.out.println("Not Found");
        return false;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input from the user
        int matrices[][] = new int[3][3];
        int row = matrices.length;
        int col = matrices[0].length;

        
        
        System.out.println("Enter array element ..");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrices[i][j] = sc.nextInt();
            }
        }

        // output
        System.out.println("Output.....");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrices[i][j]+ " ");
            }
            System.out.println();
        }
        // Search method
        System.out.print("Enter Key : ");
        int key = sc.nextInt();
        search(matrices,key);
    }
}
