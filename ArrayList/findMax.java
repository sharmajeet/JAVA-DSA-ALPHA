import java.util.*;

public class findMax {
public static void main(String[] args) {
    ArrayList<Integer> mylist = new ArrayList<>();
    mylist.add(5);
    mylist.add(4);
    mylist.add(2);
    mylist.add(10);
    mylist.add(8);
    // logic , first we init -infinite as our max value then comapare with arraylist values 
    int max = Integer.MIN_VALUE;
    for(int i=0;i<mylist.size();i++){
        if(max < mylist.get(i)){
            max = mylist.get(i);
        }
    }
System.out.println("Max value is : " + max);
}    
}
