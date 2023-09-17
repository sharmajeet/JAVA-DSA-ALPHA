// public class TowerOfHanoi {
//     public static void towerOfHanoi(int n, String src , String helper , String dest){
//         // base case
//         if(n == 1){
//             System.out.println("transfer disk "+ n + " from "+ src+" to "+ dest+" .");
//             return;
//         }
//         //first step me n-1 disk ko src se helper me teransfer karna he so n = 3-1 =2 disk transfer from src to helper..
//         //so source as itis but dest become helper and helper become dest.. for n-1 step
//         towerOfHanoi(n-1, src, dest, helper);
//         System.out.println("transfer disk "+ n + " from "+ src+" to "+ dest+" .");
//         //now transfering disks from helper to destination
//         towerOfHanoi(n-1, helper,src, dest);
//     }
//     public static void main(String[] args) {
//         int n =1;
//         towerOfHanoi(n, "source", "helper", "destination");
//     }
// }

public class TowerOfHanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        // base case
        if (n == 1) {
            System.out.println("Transfering disk " + n + " from " + src + " to " + dest + " .");
            return;
        }
        // recursive case
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("Transfering disk " + n + " from " + src + " to " + dest + " .");
        towerOfHanoi(n - 1, helper, src, dest);

    }

    public static void main(String[] args) {
        int n = 2;
        towerOfHanoi(n, "Source", "Helper", "Destination");
    }
}