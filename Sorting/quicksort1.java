public class quicksort1 {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Quick(int arr[],int si, int ei){
        // base case
        if(si >= ei){
            return;
        }
        //finding pivote index
        int pIdx = partition(arr, si, ei);
        Quick(arr, si, pIdx-1);
        Quick(arr, pIdx+1, ei);
    }

    public static int partition(int arr[], int si,int ei){
        // pivote
        int pivote = arr[ei];
        int i = si-1;
        {
            for(int j = si; j<ei;j++){
                if(arr[j] < pivote){
                    i++;
                    // swap
                    int temp = arr[j];
                    arr[j] =arr[i];
                    arr[i] = temp; 
                }
            }
            // setting pivote
            i++;
            //swap
            int temp = pivote;
            arr[ei] = arr[i];
            arr[i] =temp;

            return i;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1,5,-9,2,-3,5,4};
        Quick(arr, 0, arr.length - 1);
        printArr(arr);

    }
}
