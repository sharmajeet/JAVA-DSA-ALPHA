//<------------TIME COMPLEXITY = "O(n)"---------------->

public class LargestValue { 
    public static int getLargest(int number[]) {///method1 for finding the largest value from array
        int largest = Integer.MIN_VALUE; // hear Integer.MIN_VALUE means smallest integer infinity number.[-infinity]

        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
        }
        return largest;
    }

    public static int getSmallest(int number[]) {///method2 for finding the smallest value from array
        int smallest = Integer.MAX_VALUE; // hear Integer.MAX_VALUE means largest integer infinity number.[+infinity]

        for (int i = 0; i < number.length; i++) {
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        return smallest;

    }

    public static void main(String[] args) {
        int number[] = { 88, 55, 6, 44, 78, 545, 5, 4545, 5, 45 };
        System.out.println("Largest Number From Array Is : " + getLargest(number));
        System.out.println("Smallest Number From Array Is : " + getSmallest(number));
    }

}