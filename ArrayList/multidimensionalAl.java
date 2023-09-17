import java.util.*;

public class multidimensionalAl {
    public static void main(String[] args) {
        // first we declare the main list which contain other list in it.
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        // now we decalre nested lists..
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(8);
        list1.add(5);
        // adding list1 in to mainlist
        mainlist.add(list1);
        // same for list2..
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(10);
        list2.add(6);
        // adding list2 into mainlist
        mainlist.add(list2);
        // 3rd list
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(699);
        list3.add(477);
        // adding to mainlist
        mainlist.add(list3);

        // now we have to create a nested loop structure to traverse and print our
        // lists.
        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> temp = mainlist.get(i); // get(i) contains whole nested array lists now we have to
                                                       // travers them.
            for (int j = 0; j < temp.size(); j++) {
                System.out.print(temp.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainlist);
    }
}
