public class SubArray {
    public static void subArray(int array[]) {
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            int start = i;
            for (int j = i; j < array.length; j++) {
                int end = j;
                current_sum = 0;
                for (int k = start; k <= end; k++) {
                    current_sum = current_sum + array[k];
                }
                System.out.println("Current sum:" + current_sum);
                if (max_sum < current_sum) {
                    max_sum = current_sum;
                }
            }
        }
        System.out.println("Maximum sum: " + max_sum);

    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 6, 8, 10 };
        subArray(array);
    }
}