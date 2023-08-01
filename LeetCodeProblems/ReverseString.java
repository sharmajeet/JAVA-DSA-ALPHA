// import java.util.Scanner;

// public class ReverseString{
// public static void main(String[] args) {
//     char s[] =new char[5];
    
// }

// }
class ReverseString {
    public void reverseString(char[] s) {
         int i =0 ;
         int j = s.length-1;
         solve(s,i,j);
    }
    public void solve(char[] s, int i,int j){
        if(i>= j){
            return;
        }
        char  temp = s[i];
        s[i]=s[j];
        s[j]=temp;
        // recursive calls
        solve(s, ++i, --j);
    }
}