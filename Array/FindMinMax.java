public class FindMinMax {
    public static void maxmin(int arr[]) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
            if(arr[i] < arr[min]){
                min = i;    
            }
            
        }
        System.out.println("Min Value At Index : " + min);
        System.out.println("Max Value At Index : " + max);
        
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 7, 6, 2, 60 };
        maxmin(arr);
    }
}