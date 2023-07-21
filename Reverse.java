import java.util.Scanner;

public class Reverse{
    public static void reverse(String str,int index){
        //base case for index= 0
        if(index == 0 ){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        reverse(str, index-1);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter String hear : ");
        String str = sc.nextLine();
        int index =0;
        //calling function
        reverse(str,str.length()-1);
        sc.close();
    }
}