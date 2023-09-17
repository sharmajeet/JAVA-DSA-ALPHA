public class Permutation{
    public static void findPermutation(String str , String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        // recursive case
        for(int i=0;i<str.length();i++){
            // find first char
            char curr_char = str.charAt(i);
            // removing element
            String newStr = str.substring(0, i) + str.substring(i+1);
            findPermutation(newStr, ans+curr_char);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }
}