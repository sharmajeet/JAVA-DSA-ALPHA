package DSASHEET;

import java.util.*;

class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[5];
        System.out.println("Enter array values: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        containsDuplicate(nums);
        if (containsDuplicate(nums) == true) {
            System.out.print("True,conatains duplicate values.");
        }
        if (containsDuplicate(nums) == false) {
            System.out.print("False , not conataining duplicate values.");
        }

    }
}