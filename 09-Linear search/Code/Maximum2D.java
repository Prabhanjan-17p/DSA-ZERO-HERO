import java.util.Arrays;
public class Maximum2D {
    public static void main(String[] args) {
        int[][] arr ={
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {98,12}
        };
        int target =98;
        System.out.println(searchMax(arr));
    }

    //it is gives the out put is like a array {row,column}
    static  int searchMax(int[][] arr){
        int max = Integer.MIN_VALUE; //it's means is the minimum value store a variable is --> -2147483648;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) { // it check the 0-n, rows of length (arr[row].length)
                if (arr[row][col] > max){
                    max=arr[row][col];
                }
            }
        }
        return max;
    }

}
