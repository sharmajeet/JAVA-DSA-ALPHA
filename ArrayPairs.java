public class ArrayPairs{
    public static int  arrayPairs(int numbers[]) {
        for(int i=0; i<numbers.length; i++) { 
            int cuurent_pos = numbers[i]; //first value that always static and pair with all others values.
             for(int j=i+1;j<numbers.length;j++) { //numbers[j] store next value of i+1..
                System.out.print("("+ cuurent_pos + "," + numbers[j]+")");
        }
    }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4 };
        arrayPairs(numbers);
    }
}