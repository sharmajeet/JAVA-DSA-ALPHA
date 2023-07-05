package DSASHEET;

import java.util.Arrays;

public class ChoclateDistribution{
    public static int choclate(int array[],int student){
        Arrays.sort(array);
        int min_diff = Integer.MAX_VALUE;
        if(student == 0 || array.length == 0){
            return 0;
        }
        for(int i=0;i+student-1<array.length-1;i++){
            int diff = array[student+i-1]-array[i];
            if(diff<min_diff){
                min_diff = diff;
            }
        }
        return min_diff;
    }
    public static void main(String[] args) {
        int array[] = {7,8,9,4,5,6,1,2,3,11,2,22,33,44,55,66,77,88,99,121};
        int student = 5;
        System.out.println("Minimum Diffrence : "+ choclate(array,student));
    }
}