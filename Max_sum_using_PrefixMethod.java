public class Max_sum_using_PrefixMethod {
    
    public static void subArray(int array[]) {
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int prefix[] = new int[array.length];

        prefix[0] = array[0]; //means both values are same in both array at 0th position..
        for(int i=1; i<prefix.length; i++) {
            prefix[i]= prefix[i-1]+array[i];   //prefix[i] always prefix[i-1] means privious sum and next is array[i] ..array cureent value 
        }

        for(int i=0;i<array.length;i++) {
            int start = i;
            for(int j=0;j<array.length;j++) {
                int end = j ; 

                current_sum = start ==0 ?prefix[end] :prefix[end]+prefix[start-1];
                if(max_sum < current_sum){
                    max_sum = current_sum;
                }
            }
            
        }
        System.out.println("Maximum sum: " + max_sum);
}
    public static void main(String[] args) {
        int array[] = {1,-2,6,-1,3};
        subArray(array);
    }
}
