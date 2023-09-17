public class SubsetProblem {
    public static void findSubset(String str, String subset, int index) {
        // base case
        if (index == str.length()) {
            if (subset.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(subset);
            }
            return;
        }
        // kaam
        // Yes Choice
        findSubset(str, subset + str.charAt(index), index + 1);
        // No choice
        findSubset(str, subset, index + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        // calling function
        findSubset(str, "", 0);
    }
}