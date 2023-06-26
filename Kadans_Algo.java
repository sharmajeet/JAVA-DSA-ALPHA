public class Kadans_Algo{
    public static void kadans(int array[]) {
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for(int i=0 ; i<array.length ; i++) {
            current_sum = current_sum + array[i];
            if(current_sum < 0){
                current_sum = 0;
            }
            max_sum = Math.max(current_sum, max_sum);
        }
        System.out.println("Max Sum Is : " + max_sum);
    }
    public static void main(String[] args) {
        int array[] = {-2,-3,4,-1,-2,1,5,-3};
        kadans(array);

    }
}