import java.util.*;

public class pairSum {
    // brute force approch
    public static boolean havePair(ArrayList<Integer> list, int target) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++)
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
        }
        return false;
    }

    // optimized approch -2 pointer approch
    public static boolean isPair(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;

        while (lp != rp) {
            // case1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 50;
        System.out.println(havePair(list, target));
        System.out.println("Target Pair is Possible : " + isPair(list, target));

    }

}
