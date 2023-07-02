package Sorting;
public class InsertionSort{
    public static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr = arr[i];  //arr[i] is a temp storage..
            int prev = i-1;
            // finding position
        while(prev >=0 && arr[prev] >curr){
            arr[prev+1] =arr[prev];
            prev--;
        }
        // actual insertion
        arr[prev+1] =curr;
    }
    }
    public static void print(int arr[]){
        System.out.print("sorted array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]= {9,8,7,6,5,4};
        sort(arr);
        print(arr);
    }
}