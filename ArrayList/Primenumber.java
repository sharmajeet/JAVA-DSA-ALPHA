import java.util.ArrayList;

public class Primenumber {
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>();
        // adding elements
        mylist.add(4);
        mylist.add(6);
        mylist.add(9);
        // first we printing size of our arraylist.
        System.out.println("Size : " + mylist.size());
        // now we can iterate our arraylist.
        for (int i = 0; i < mylist.size(); i++) {
            System.out.print(mylist.get(i) + " ");
        }
        System.out.println();
        // now we can print reverse of our array elements
        for (int i = mylist.size() - 1; i >= 0; i--) {
            System.out.print(mylist.get(i) + " ");
        }
    }
}
