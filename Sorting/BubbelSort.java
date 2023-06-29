package Sorting;
import java.util.*;
public class BubbelSort{
    public static void sort(int array[]) {
        for(int turn=0; turn<array.length-1;turn++){
            for(int j=0;j<array.length-1-turn;j++){
                if(array[j]>array[j+1]){
                    // swaping
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        
    }
    public static void print_array(int array[]) {
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int array[] = {99,77,88,66,4,44};
    sort(array);
    print_array(array);
   }
}

