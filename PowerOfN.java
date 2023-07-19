
// x^n means 2^3=8
import java.util.*;

public class PowerOfN {
    public static int power(int x, int n) {
        // base-case 1
        if (x == 0) {
            return 0;
        }
        // base-case 2
        if (n == 0) {
            return 1;
        }
        // kaam -- logic : x^n = x*(n-1)
        int xpowern_1 = power(x, n - 1);
        int xpower = x * xpowern_1; // x=2 and n=5 so 2*2*2*2*2 =32
        return xpower;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for X : ");
        int x = sc.nextInt();

        System.out.print("Enter value for N : ");
        int n = sc.nextInt();

        // calling function
        int ans = power(x, n);
        System.out.println("Ans is : "+ans);
        sc.close();
    }
}

