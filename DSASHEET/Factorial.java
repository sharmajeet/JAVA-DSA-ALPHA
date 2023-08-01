package DSASHEET;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        int fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();

        // iterative loop
        for(int i=1; i<=n; i++){
           fact = fact * i;
        }
        System.out.print("Factorial : "+ fact);
    }
    
}
