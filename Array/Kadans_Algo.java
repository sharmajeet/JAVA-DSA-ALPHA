public class Kadans_Algo {
    public static void kadans(int array[]) {
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            current_sum = current_sum + array[i];
            if (current_sum < 0) {
                current_sum = 0;
            }
            max_sum = Math.max(current_sum, max_sum);
        }
        System.out.println("Max Sum Is : " + max_sum);
    }

    public static void kadans_negative(int array[]) {
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        int min_value_array = Integer.MAX_VALUE;

        // check if array contains all negatieve values
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max_sum) {
                max_sum = array[i];
                System.out.println(max_sum);
            }
        }

        for (int i = 0; i < array.length; i++) {
            current_sum = current_sum + array[i];
            if (current_sum < 0) {
                current_sum = 0;
            }
            max_sum = Math.max(current_sum, max_sum);

        }
        System.out.println("Max sum: " + max_sum);
    }

    public static void main(String[] args) {
        int array[] = { -2, -3, -9, -3 };
        // kadans(array);
        kadans_negative(array);
    }
}