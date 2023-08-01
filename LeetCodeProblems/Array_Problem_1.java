// Aim: given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:
// Input: nums = [3,2,4], target = 6
// Output: [1,2]
package LeetCodeProblems;
import java.util.*;

public class Array_Problem_1 {
    public static int[] twosum(int nums[], int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }

        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array_Problem_1 solution = new Array_Problem_1();
        int nums[] = new int[5];
        System.out.println("Enter Array Values : ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter Target : ");
        int target = sc.nextInt();
        int[] result = solution.twosum(nums, target);
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }

}

// class Array_Problem_1 {
// public int[] twoSum(int[] nums, int target) {
// for (int i = 0; i < nums.length; i++) {
// for (int j = i + 1; j < nums.length; j++) {
// if (nums[i] + nums[j] == target) {
// return new int[] { i, j };
// }
// }
// }
// return new int[] {};
// }

// public static void main(String[] args) {
// Array_Problem_1 solution = new Array_Problem_1 ();

// // Sample input
// int[] nums = { 2, 7, 11, 15 };
// int target = 9;

// // Call the twoSum method
// int[] result = solution.twoSum(nums, target);

// // Print the output
// System.out.print("Output: [");
// for (int i = 0; i < result.length; i++) {
// System.out.print(result[i]);
// if (i != result.length - 1) {
// System.out.print(", ");
// }
// }
// System.out.println("]");
// }
// }
