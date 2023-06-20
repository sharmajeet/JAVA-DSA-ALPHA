//1st method 

// class sum  {
//     public int func(int n) {
//         return n * (n + 1)/2;
//     }
// }

// class Sumof_n_numbers{
   
//     public static void main(String[] args) {
//         sum obj = new sum();
//         int ans =obj.func(3);
//         System.out.println("Anser is : " + ans);
//     }
// }

// 2nd method using loops
class sum{
    public int func(int n) {
    // int num = 0;
    int sum = 0 ;
    for (int i = 1; i <=n; i++){ 
        sum = sum + i;
        // n++;
      
}
return sum;
}
}

class Sumof_n_numbers{
    public static void main(String[] args) {
        sum s1 = new sum();
       int ans = s1.func(3);
        System.out.println("Anser is : " + ans);
    }
}   

// 3rd method 

// class Sum {
//     public int main(int n) {
//         int sum = 0;
//         for (int i = 0; i <= n; i++) {
//             for (int j = 0; j <= i; j++) {
//                 sum += j;
//             }
//         }
//         return sum;
//     }
// }

// class Sumof_n_numbers {
//     public static void main(String[] args) {
//         Sum obj = new Sum();
//         int ans = obj.main(3);
//         System.out.println("Answer is: " + ans);
//     }
// }
