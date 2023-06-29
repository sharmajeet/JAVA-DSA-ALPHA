// import java.util.*;//<------------TIME COMPLEXITY = "O(n)"---------------->

public class Array{
public static void main(String[] args) {
    System.out.println("Array");
    int array1[] = new int[3];
    array1[0]=23;
    array1[1]=93;
    array1[2]=33;
    for(int i=0; i<array1.length; i++){
        int increment = array1[i]+1;
        System.err.println(increment+ " ");
    }
    System.out.println(" ");
}
}

