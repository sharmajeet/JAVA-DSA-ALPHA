import java.util.*;

public class waterStoreage {
    public static int water_stored(ArrayList<Integer> height) {
        int maxwater = 0;
        // brute force approch
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                // first we finding min height of i and j.
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int curr_stord_water = width * ht;
                // comaring max value for curreent and maxwater value.
                maxwater = Math.max(maxwater, curr_stord_water);
            }
        }
        return maxwater;

    }

    // 2nd approch - O(1) time complexity
    public static int waterTank(ArrayList<Integer> height) {
        int maxwater = 0;
        int left_pointer = 0;
        int right_pointer = height.size() - 1;
        // finding water storage area
        while (left_pointer < right_pointer) {
            // finding ht for min
            int ht = Math.min(height.get(left_pointer), height.get(right_pointer));
            // conditions update ptrs
            if (height.get(left_pointer) < height.get(right_pointer)) {
                left_pointer++;
            } else {
                right_pointer--;
            }
            int width = right_pointer - left_pointer;
            int curr_val = ht * width;

            maxwater = Math.max(maxwater, curr_val);

        }
        return maxwater;

    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        // calling function
        System.out.println("Maximum Water Stored : " + water_stored(height) + " Units.O(n2)");
        System.out.println("Maximum Water Stored : " + waterTank(height) + " Units. O(1)");
    }
}