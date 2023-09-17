import java.util.*;
public class inbuiltSorting {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(5); 
       list.add(45); 
       list.add(95); 
       list.add(8); 
       list.add(3); 
       list.add(-11); 
       System.out.print(list+" ");
       System.out.println();
    //    for sorting we use collections class 
    Collections.sort(list);
    System.out.print(list+" ");
    System.out.println();
    // now we sort in desending order.we collections COMPARATOR in which code for special task code is define in comporator.
    Collections.sort(list,Collections.reverseOrder(null));
    System.out.print(list+" ");

    }
}
