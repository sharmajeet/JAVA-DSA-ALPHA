public class FindOcuurence {
    // declaration of first and last ..
    public static int first = -1;
    public static int last = -1;

    public static void find(String str, int index, char element) {
        // base case .. when to return
        if (index == str.length()) {
            System.out.println("First Ocuurence At " + first + " Index.");
            System.out.println("Last Ocuurence At " + last + " Index.");
            return;
        }
        // find current character
        char current_char = str.charAt(index);
        // aapply conditions
        if (current_char == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        find(str, index + 1, element);
    }

    public static void main(String[] args) {
        String str = "ababbabababab";
        find(str, 0, 'a');
    }
}