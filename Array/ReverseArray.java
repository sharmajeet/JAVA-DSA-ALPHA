public class ReverseArray {
    public static int reverse(int number[]) {
        int start = 0;
        int end = number.length - 1;
        while (start < end) {
            int temp = number[end];
            number[end] = number[start];
            number[start] = temp;
            start++;
            end--;
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 44, 88, 65, 74, 12, 35, 45 };
        reverse(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }
}