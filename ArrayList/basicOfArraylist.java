import java.util.*;

//array list is a dynamic array data structure where we can allocate memory for the array elements dynamically.
class basicOfArraylist {

    public static void main(String[] args) {
        ArrayList<Integer> myarraylist = new ArrayList<>();
        ArrayList<String> myArraylist = new ArrayList<>();
        ArrayList<Boolean> myarrlist = new ArrayList<>();
        // time complexity to add data in arraylist is O(1).
        myarraylist.add(1);
        myarraylist.add(3);
        myarraylist.add(5);
        System.out.println(myarraylist);

        // for string data type
        myArraylist.add("jeet");
        myArraylist.add("hitu");
        myArraylist.add("jyoti");
        myArraylist.add("shailesh");
        myArraylist.add("piyush");
        System.out.println(myArraylist);

    }
}