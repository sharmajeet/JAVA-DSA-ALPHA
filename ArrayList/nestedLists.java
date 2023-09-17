import java.util.*;

public class nestedLists {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        // sub nested lists
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        // now inserting data in nested arrlists
        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1);
            list2.add(i * 2);
            list3.add(i * 3);
        }
        mainlist.add(list1);
        mainlist.add(list2);
        // delete operation
        list2.remove(3);
        list2.remove(2);
        mainlist.add(list3);

        // printing lsits
        for (int i = 0; i < mainlist.size(); i++) {
            // temp arraylist to store all of nested list of mainlist
            ArrayList<Integer> temp = mainlist.get(i);
            for (int j = 0; j < temp.size(); j++) {
                System.out.print(temp.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainlist);
    }

}
