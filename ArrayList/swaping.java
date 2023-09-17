import java.util.*;

public class swaping {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(9);
        list.add(45);
        list.add(3);
        list.add(5);
        list.add(39);
        System.out.print("before swap : " + list);
        System.out.println();
        int idx1 = 2, idx2 = 4;
        swap(list, idx1, idx2);
        System.out.print("After swap : " + list);
    }
}