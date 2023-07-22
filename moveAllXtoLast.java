//in this code we move all 'x' at last of string and print that new string
public class moveAllXtoLast {
    public static void moveAll(String str, int index, int count, String newString) {
        // base-case
        if (index == str.length()) {
            for (int i = 0; i <= count; i++) {
                newString = newString + 'x';
            }
            System.out.println("String is : "+newString);
            return;
        }
        // Conditions
        // first finding current char for comparision
        char current_char = str.charAt(index);
        if (current_char == 'x') {
            count++;
            moveAll(str, index + 1, count, newString);
        } else {
            // newString = newString+current_char;
            newString += current_char;
            moveAll(str, index + 1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str = "jxeext";
        moveAll(str, 0, 0,"");
    }
 }


// public class moveAllXtoLast {
//     public static void movelast(String str, int index, int count, String newString) {
//         // base case
//         if (index == str.length()) {
//             for (int i = 0; i <= count; i++) {
//                 newString += 'x';
//             }
//             System.out.println("String is : "+ newString);
//             return;
//         }
//         // condition
//         // finding current char for comarision
//         char current_char = str.charAt(index);
//         if (current_char == 'x') {
//             count++;
//             movelast(str, index + 1, count, newString);
//         } else {
//             newString += current_char;
//             movelast(str, index + 1, count, newString);
//         }
//     }

//     public static void main(String[] args) {
//         String str = "jxexext";
//         movelast(str, 0, 0,"");

//     }
// }