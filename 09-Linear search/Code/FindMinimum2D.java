
import java.util.Arrays;
public class FindMinimum2D {
    public static void main(String[] args) {
        int[][] arr ={
                {23,4,-31},
                {18,12,3,9},
                {78,99,34,56},
                {98,12}
        };
        int target =98;
        System.out.println(searchMin(arr));
    }

    static  int searchMin(int[][] arr){
        int min = Integer.MAX_VALUE; //it's means is the maximum value store a variable is --> 2147483647;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) { // it check the 0-n, rows of length (arr[row].length)
                if (arr[row][col] < min){
                    min=arr[row][col];
                }
            }
        }
        return min;
    }

}
